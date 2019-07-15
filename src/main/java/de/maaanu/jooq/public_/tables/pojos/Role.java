/*
 * This file is generated by jOOQ.
 */
package de.maaanu.jooq.public_.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * A table to contain all roles
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Role implements Serializable {

    private static final long serialVersionUID = 424054768;

    private Integer id;
    private String  description;

    public Role() {}

    public Role(Role value) {
        this.id = value.id;
        this.description = value.description;
    }

    public Role(
        Integer id,
        String  description
    ) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public Role setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Role setDescription(String description) {
        this.description = description;
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
        final Role other = (Role) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Role (");

        sb.append(id);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}