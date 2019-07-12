package de.maaanu

import javax.inject.Singleton

@Singleton
class UserService() {

    fun save(user: User): Long? = 2

    fun getUserByUsername(username: String): User? = null
}
