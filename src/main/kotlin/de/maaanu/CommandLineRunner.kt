package de.maaanu

import io.micronaut.configuration.dbmigration.liquibase.LiquibaseConfigurationProperties
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.discovery.event.ServiceStartedEvent
import javax.inject.Singleton
import javax.sql.DataSource

@Singleton
class CommandLineRunner(val userService: UserService,
                        val dataSource : DataSource,
                        val liquibaseConfigurationProperties: LiquibaseConfigurationProperties) : ApplicationEventListener<ServiceStartedEvent> {

    override fun onApplicationEvent(event: ServiceStartedEvent?) {

        val user = User()
        user.username = "Username"
        user.password = "Pwd"
        userService.save(user)

        println(userService.getUserByUsername("Username"))
    }
}
