/*
 * This file is generated by jOOQ.
 */
package de.maaanu.jooq.public_.tables.daos;


import de.maaanu.jooq.public_.tables.Databasechangeloglock;
import de.maaanu.jooq.public_.tables.records.DatabasechangeloglockRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatabasechangeloglockDao extends DAOImpl<DatabasechangeloglockRecord, de.maaanu.jooq.public_.tables.pojos.Databasechangeloglock, Integer> {

    /**
     * Create a new DatabasechangeloglockDao without any configuration
     */
    public DatabasechangeloglockDao() {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK, de.maaanu.jooq.public_.tables.pojos.Databasechangeloglock.class);
    }

    /**
     * Create a new DatabasechangeloglockDao with an attached configuration
     */
    public DatabasechangeloglockDao(Configuration configuration) {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK, de.maaanu.jooq.public_.tables.pojos.Databasechangeloglock.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(de.maaanu.jooq.public_.tables.pojos.Databasechangeloglock object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<de.maaanu.jooq.public_.tables.pojos.Databasechangeloglock> fetchById(Integer... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public de.maaanu.jooq.public_.tables.pojos.Databasechangeloglock fetchOneById(Integer value) {
        return fetchOne(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, value);
    }

    /**
     * Fetch records that have <code>LOCKED IN (values)</code>
     */
    public List<de.maaanu.jooq.public_.tables.pojos.Databasechangeloglock> fetchByLocked(Boolean... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED, values);
    }

    /**
     * Fetch records that have <code>LOCKGRANTED IN (values)</code>
     */
    public List<de.maaanu.jooq.public_.tables.pojos.Databasechangeloglock> fetchByLockgranted(Timestamp... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED, values);
    }

    /**
     * Fetch records that have <code>LOCKEDBY IN (values)</code>
     */
    public List<de.maaanu.jooq.public_.tables.pojos.Databasechangeloglock> fetchByLockedby(String... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY, values);
    }
}