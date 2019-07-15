package de.maaanu.config

import de.maaanu.jooq.public_.tables.daos.UserDao
import de.maaanu.util.getPrivilegesFromUser
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import io.micronaut.security.authentication.*
import io.reactivex.Flowable
import org.jooq.DSLContext
import org.mindrot.jbcrypt.BCrypt
import org.reactivestreams.Publisher
import java.security.Principal
import javax.inject.Singleton

@Singleton
class UsernamePasswordAuthenticationProvider(private val userDao: UserDao,
                                             private val dsl: DSLContext) : AuthenticationProvider {

    override fun authenticate(authenticationRequest: AuthenticationRequest<*, *>?): Publisher<AuthenticationResponse> {
        if (authenticationRequest is UsernamePasswordCredentials) {

            val user = userDao.fetchOneByUsername(authenticationRequest.username)
            if (BCrypt.checkpw(authenticationRequest.password, user.password)) {
                val privileges = getPrivilegesFromUser(user, dsl)
                        .map { it.privilegeType.name }
                return Flowable.just(UserDetails(user.username, privileges))
            }
        }

        return Flowable.just(AuthenticationFailed())
    }
}

@Secured("isAuthenticated()")
@Controller
class HomeController {

    @Get("/me")
    @Secured("READ")
    internal fun index(principal: Principal): String {
        return principal.name
    }
}
