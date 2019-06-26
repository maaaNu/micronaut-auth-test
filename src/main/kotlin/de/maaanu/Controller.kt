package de.maaanu

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Produces
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Controller
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule


@Controller("/hello")
@Secured(SecurityRule.IS_ANONYMOUS)
class HelloController {
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Hello World"
    }
}
