package de.maaanu

import io.micronaut.context.ApplicationContext
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.security.authentication.UsernamePasswordCredentials
import io.micronaut.security.token.jwt.render.BearerAccessRefreshToken
import org.assertj.core.api.Assertions.*
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it


object JwtAuthenticationSpec : Spek({
    var embeddedServer : EmbeddedServer = ApplicationContext.run(EmbeddedServer::class.java)
    var client : RxHttpClient = RxHttpClient.create(embeddedServer.url)

    describe("Authentication Suit") {

        it("Accessing a secured URL without authenticating returns unauthorized") {
            assertThatExceptionOfType(HttpClientResponseException::class.java)
                    .isThrownBy {  client.toBlocking().retrieve("/hello") }
                    .withMessage("Unauthorized")

        }

        it("Login endpoint is called with valid credentials the endpoint can be accessed") {
            val creds = UsernamePasswordCredentials("sherlock", "password")
            val req = HttpRequest.POST("/login", creds)
            val rsp = client.toBlocking().exchange(req, BearerAccessRefreshToken::class.java)
            assertThat(rsp.status).isEqualTo(HttpStatus.OK)
        }

        afterGroup {
            client.close()
            embeddedServer.close()
        }
    }
})
