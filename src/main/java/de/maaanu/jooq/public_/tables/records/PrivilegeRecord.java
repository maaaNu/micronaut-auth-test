/*
 * This file is generated by jOOQ.
 */
package de.maaanu.jooq.public_.tables.records;


import de.maaanu.PrivilegeType;
import de.maaanu.jooq.public_.tables.Privilege;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class PrivilegeRecord extends UpdatableRecordImpl<PrivilegeRecord> implements Record2<Integer, PrivilegeType> {

    private static final long serialVersionUID = -1642278821;

    /**
     * Setter for <code>PUBLIC.PRIVILEGE.ID</code>.
     */
    public PrivilegeRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.PRIVILEGE.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.PRIVILEGE.PRIVILEGE_TYPE</code>.
     */
    public PrivilegeRecord setPrivilegeType(PrivilegeType value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.PRIVILEGE.PRIVILEGE_TYPE</code>.
     */
    public PrivilegeType getPrivilegeType() {
        return (PrivilegeType) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, PrivilegeType> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, PrivilegeType> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Privilege.PRIVILEGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<PrivilegeType> field2() {
        return Privilege.PRIVILEGE.PRIVILEGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrivilegeType component2() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrivilegeType value2() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrivilegeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrivilegeRecord value2(PrivilegeType value) {
        setPrivilegeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrivilegeRecord values(Integer value1, PrivilegeType value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PrivilegeRecord
     */
    public PrivilegeRecord() {
        super(Privilege.PRIVILEGE);
    }

    /**
     * Create a detached, initialised PrivilegeRecord
     */
    public PrivilegeRecord(Integer id, PrivilegeType privilegeType) {
        super(Privilege.PRIVILEGE);

        set(0, id);
        set(1, privilegeType);
    }
}
