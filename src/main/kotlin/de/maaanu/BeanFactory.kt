package de.maaanu

import io.micronaut.context.annotation.Factory
import org.jdbi.v3.core.Jdbi
import javax.inject.Singleton
import javax.sql.DataSource

@Factory
class BeanFactory {

    @Singleton
    fun connectionProvider(dataSource : DataSource) : Jdbi {
        val jdbi = Jdbi.create(dataSource)
        jdbi.installPlugins()
        return jdbi
    }

}


