package de.maaanu

import org.jdbi.v3.core.Jdbi
import javax.inject.Singleton

@Singleton
class UserService(val jdbi: Jdbi) {

    fun save(user: User): Long? =
            jdbi.onDemand(UserRepository::class.java).save(user)

    fun getUserByUsername(username: String): User? =
            jdbi.onDemand(UserRepository::class.java).getUserByUsername(username);
}
