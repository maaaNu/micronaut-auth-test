package de.maaanu

import io.micronaut.context.annotation.Requires
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.runtime.server.event.ServerStartupEvent
import nu.studer.sample.public_.tables.User.*
import org.jooq.DSLContext
import javax.inject.Singleton

@Singleton
@Requires(beans = [DSLContext::class])
class CommandLineRunner(private val dslContext: DSLContext) : ApplicationEventListener<ServerStartupEvent> {

    override fun onApplicationEvent(event: ServerStartupEvent?) {
        dslContext.insertInto(USER)
                .set(USER.USERNAME, "test")
                .set(USER.PASSWORD, "123")
                .execute()

        dslContext.select(USER.ID, USER.USERNAME, USER.PASSWORD).fetchAny().into(USER::class.java).apply {
            println(this)
        }
    }
}
