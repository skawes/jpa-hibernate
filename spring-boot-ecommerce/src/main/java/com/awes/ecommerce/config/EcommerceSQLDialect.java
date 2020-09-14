package com.awes.ecommerce.config;

import java.sql.Types;

import org.hibernate.dialect.InnoDBStorageEngine;
import org.hibernate.dialect.MySQL55Dialect;
import org.hibernate.dialect.MySQLStorageEngine;
import org.hibernate.type.StandardBasicTypes;

public class EcommerceSQLDialect extends MySQL55Dialect {
	public EcommerceSQLDialect() {
		registerHibernateType(Types.NVARCHAR, StandardBasicTypes.NSTRING.getName());
	}

	@Override
	public String getTableTypeString() {
		return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
	}

	@Override
	protected MySQLStorageEngine getDefaultMySQLStorageEngine() {
		return InnoDBStorageEngine.INSTANCE;
	}

}
