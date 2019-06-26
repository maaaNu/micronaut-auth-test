package de.maaanu

import org.jdbi.v3.sqlobject.customizer.Bind
import org.jdbi.v3.sqlobject.customizer.BindBean
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.SqlUpdate

interface UserRepository {
    @SqlUpdate("insert into user (username, password) values(:username, :password)")
    @GetGeneratedKeys
    fun save(@BindBean user: User): Long?

    @SqlQuery("select * from user where username=:username")
    fun getUserByUsername(@Bind("username") username: String): User?
}
