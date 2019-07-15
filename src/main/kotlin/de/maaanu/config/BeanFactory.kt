package de.maaanu.config

import de.maaanu.jooq.public_.tables.daos.PrivilegeDao
import de.maaanu.jooq.public_.tables.daos.RoleDao
import de.maaanu.jooq.public_.tables.daos.UserDao
import io.micronaut.context.annotation.Factory
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import javax.inject.Singleton
import javax.sql.DataSource

@Factory
class BeanFactory {

    @Singleton
    fun dslContext(dataSource: DataSource): DSLContext {
        return DSL.using(dataSource, SQLDialect.H2)
    }

    @Singleton
    fun userDao(dslContext: DSLContext): UserDao {
        return UserDao(dslContext.configuration())
    }

    @Singleton
    fun privilegeDao(dslContext: DSLContext): PrivilegeDao {
        return PrivilegeDao(dslContext.configuration())
    }

    @Singleton
    fun roleDao(dslContext: DSLContext): RoleDao {
        return RoleDao(dslContext.configuration())
    }
}
