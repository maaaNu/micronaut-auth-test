/*
 * This file is generated by jOOQ.
 */
package de.maaanu.jooq.public_.tables.pojos;


import java.io.Serializable;

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
public class RolePrivilege implements Serializable {

    private static final long serialVersionUID = 860652757;

    private Integer roleId;
    private Integer privilegeId;

    public RolePrivilege() {}

    public RolePrivilege(RolePrivilege value) {
        this.roleId = value.roleId;
        this.privilegeId = value.privilegeId;
    }

    public RolePrivilege(
        Integer roleId,
        Integer privilegeId
    ) {
        this.roleId = roleId;
        this.privilegeId = privilegeId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public RolePrivilege setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public Integer getPrivilegeId() {
        return this.privilegeId;
    }

    public RolePrivilege setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
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
        final RolePrivilege other = (RolePrivilege) obj;
        if (roleId == null) {
            if (other.roleId != null)
                return false;
        }
        else if (!roleId.equals(other.roleId))
            return false;
        if (privilegeId == null) {
            if (other.privilegeId != null)
                return false;
        }
        else if (!privilegeId.equals(other.privilegeId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.roleId == null) ? 0 : this.roleId.hashCode());
        result = prime * result + ((this.privilegeId == null) ? 0 : this.privilegeId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RolePrivilege (");

        sb.append(roleId);
        sb.append(", ").append(privilegeId);

        sb.append(")");
        return sb.toString();
    }
}