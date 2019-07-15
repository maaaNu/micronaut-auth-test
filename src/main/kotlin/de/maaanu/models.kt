package de.maaanu


data class Privilege(
        var id: Long? = null,
        var privilegeTypes: PrivilegeType
)

enum class PrivilegeType {
        READ,
        WRITE
}
