package de.maaanu.config

import io.micronaut.security.authentication.AuthenticationProvider
import io.micronaut.security.authentication.AuthenticationRequest
import io.micronaut.security.authentication.AuthenticationResponse
import org.reactivestreams.Publisher
import javax.inject.Singleton
import io.micronaut.security.authentication.AuthenticationFailed
import io.reactivex.Flowable
import java.util.ArrayList
import io.micronaut.security.authentication.UserDetails
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Produces
import io.micronaut.security.annotation.Secured
import io.micronaut.security.token.Claims
import io.micronaut.security.token.RolesFinder
import java.security.Principal
import javax.annotation.Nonnull

@Singleton
class UsernamePasswordAuthenticationProvider : AuthenticationProvider {
    override fun authenticate(authenticationRequest: AuthenticationRequest<*, *>?): Publisher<AuthenticationResponse> {
        if (authenticationRequest?.identity == "sherlock" && authenticationRequest.secret == "password") {
            return Flowable.just(UserDetails(authenticationRequest.identity as String, ArrayList()))
        }
        return Flowable.just(AuthenticationFailed())
    }
}

@Secured("isAuthenticated()")
@Controller
class HomeController {

    @Get("/me")
    @Secured("ROLE_ADMIN")
    internal fun index(principal: Principal): String {
        return principal.name
    }
}

const val REALM_ACCESS_KEY = "realm_access"
const val ROLES_KEY = "roles"

class RoleMapper : RolesFinder {

    override fun findInClaims(claims: Claims): MutableList<String> {
        return mutableListOf("ROLE_USER")
    }

}