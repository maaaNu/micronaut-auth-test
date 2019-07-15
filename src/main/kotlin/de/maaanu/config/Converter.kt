package de.maaanu.config

import de.maaanu.PrivilegeType
import org.jooq.impl.EnumConverter

class PrivilegeConverter : EnumConverter<Integer, PrivilegeType>(Integer::class.java, PrivilegeType::class.java)
