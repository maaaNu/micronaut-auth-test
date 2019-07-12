package de.maaanu

import javax.validation.constraints.NotBlank

data class User (
        var id: Long? = null,
        @get:NotBlank
        var username: String = "",
        @get:NotBlank
        var password: String = "",
        var roles: List<Role> = mutableListOf()
)

data class Role (
        var id: Long? = null,
        var privileges: List<Privilege> = mutableListOf()
)

data class Privilege(
        var id: Long? = null,
        var privilegeTypes: PrivilegeType
)

enum class PrivilegeType {
        READ,
        WRITE
}