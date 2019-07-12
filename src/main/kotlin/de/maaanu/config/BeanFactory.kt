package de.maaanu.config

import io.micronaut.context.annotation.Factory
import io.micronaut.context.annotation.Replaces
import io.micronaut.security.token.DefaultRolesFinder
import javax.inject.Singleton

@Factory
class BeanFactory {

    @Singleton
    @Replaces(DefaultRolesFinder::class)
    fun roleMapper() : RoleMapper {
        return RoleMapper()
    }
}


