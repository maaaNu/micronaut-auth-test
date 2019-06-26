package de.maaanu

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
import java.security.Principal

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
    internal fun index(principal: Principal): String {
        return principal.name
    }
}
