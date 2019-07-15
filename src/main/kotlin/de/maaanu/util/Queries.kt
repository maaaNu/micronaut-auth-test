package de.maaanu.util

import de.maaanu.jooq.public_.Tables
import de.maaanu.jooq.public_.Tables.PRIVILEGE
import de.maaanu.jooq.public_.Tables.ROLE_PRIVILEGE
import de.maaanu.jooq.public_.tables.Role.ROLE
import de.maaanu.jooq.public_.tables.UserRole.USER_ROLE
import de.maaanu.jooq.public_.tables.pojos.Privilege
import de.maaanu.jooq.public_.tables.pojos.User
import org.jooq.DSLContext

fun getPrivilegesFromUser(user: User, dsl: DSLContext): MutableList<Privilege> =
        dsl.select(Tables.USER.ID.`as`("user_id"))
                .select(ROLE.ID.`as`("role_id"))
                .select(PRIVILEGE.ID, PRIVILEGE.PRIVILEGE_TYPE)
                .from(Tables.USER)
                .innerJoin(USER_ROLE).on(Tables.USER.ID.eq(USER_ROLE.USER_ID))
                .innerJoin(ROLE).on(ROLE.ID.eq(USER_ROLE.ROLE_ID))
                .innerJoin(ROLE_PRIVILEGE).on(Tables.ROLE_PRIVILEGE.ROLE_ID.eq(ROLE.ID))
                .innerJoin(PRIVILEGE).on(PRIVILEGE.ID.eq(ROLE_PRIVILEGE.PRIVILEGE_ID))
                .where(Tables.USER.ID.eq(user.id))
                .fetch { it.into(Privilege::class.java) }
