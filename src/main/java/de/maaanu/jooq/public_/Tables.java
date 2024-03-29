/*
 * This file is generated by jOOQ.
 */
package de.maaanu.jooq.public_;


import de.maaanu.jooq.public_.tables.Databasechangelog;
import de.maaanu.jooq.public_.tables.Databasechangeloglock;
import de.maaanu.jooq.public_.tables.Privilege;
import de.maaanu.jooq.public_.tables.Role;
import de.maaanu.jooq.public_.tables.RolePrivilege;
import de.maaanu.jooq.public_.tables.User;
import de.maaanu.jooq.public_.tables.UserRole;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.DATABASECHANGELOG</code>.
     */
    public static final Databasechangelog DATABASECHANGELOG = de.maaanu.jooq.public_.tables.Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>PUBLIC.DATABASECHANGELOGLOCK</code>.
     */
    public static final Databasechangeloglock DATABASECHANGELOGLOCK = de.maaanu.jooq.public_.tables.Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>PUBLIC.PRIVILEGE</code>.
     */
    public static final Privilege PRIVILEGE = de.maaanu.jooq.public_.tables.Privilege.PRIVILEGE;

    /**
     * A table to contain all roles
     */
    public static final Role ROLE = de.maaanu.jooq.public_.tables.Role.ROLE;

    /**
     * The table <code>PUBLIC.ROLE_PRIVILEGE</code>.
     */
    public static final RolePrivilege ROLE_PRIVILEGE = de.maaanu.jooq.public_.tables.RolePrivilege.ROLE_PRIVILEGE;

    /**
     * A table to contain all users
     */
    public static final User USER = de.maaanu.jooq.public_.tables.User.USER;

    /**
     * The table <code>PUBLIC.USER_ROLE</code>.
     */
    public static final UserRole USER_ROLE = de.maaanu.jooq.public_.tables.UserRole.USER_ROLE;
}
