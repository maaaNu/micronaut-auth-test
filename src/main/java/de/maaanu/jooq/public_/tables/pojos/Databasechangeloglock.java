/*
 * This file is generated by jOOQ.
 */
package de.maaanu.jooq.public_.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Databasechangeloglock implements Serializable {

    private static final long serialVersionUID = 1060984448;

    private Integer   id;
    private Boolean   locked;
    private Timestamp lockgranted;
    private String    lockedby;

    public Databasechangeloglock() {}

    public Databasechangeloglock(Databasechangeloglock value) {
        this.id = value.id;
        this.locked = value.locked;
        this.lockgranted = value.lockgranted;
        this.lockedby = value.lockedby;
    }

    public Databasechangeloglock(
        Integer   id,
        Boolean   locked,
        Timestamp lockgranted,
        String    lockedby
    ) {
        this.id = id;
        this.locked = locked;
        this.lockgranted = lockgranted;
        this.lockedby = lockedby;
    }

    public Integer getId() {
        return this.id;
    }

    public Databasechangeloglock setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getLocked() {
        return this.locked;
    }

    public Databasechangeloglock setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    public Timestamp getLockgranted() {
        return this.lockgranted;
    }

    public Databasechangeloglock setLockgranted(Timestamp lockgranted) {
        this.lockgranted = lockgranted;
        return this;
    }

    public String getLockedby() {
        return this.lockedby;
    }

    public Databasechangeloglock setLockedby(String lockedby) {
        this.lockedby = lockedby;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Databasechangeloglock other = (Databasechangeloglock) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (locked == null) {
            if (other.locked != null)
                return false;
        }
        else if (!locked.equals(other.locked))
            return false;
        if (lockgranted == null) {
            if (other.lockgranted != null)
                return false;
        }
        else if (!lockgranted.equals(other.lockgranted))
            return false;
        if (lockedby == null) {
            if (other.lockedby != null)
                return false;
        }
        else if (!lockedby.equals(other.lockedby))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.locked == null) ? 0 : this.locked.hashCode());
        result = prime * result + ((this.lockgranted == null) ? 0 : this.lockgranted.hashCode());
        result = prime * result + ((this.lockedby == null) ? 0 : this.lockedby.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Databasechangeloglock (");

        sb.append(id);
        sb.append(", ").append(locked);
        sb.append(", ").append(lockgranted);
        sb.append(", ").append(lockedby);

        sb.append(")");
        return sb.toString();
    }
}
