package com.innova.enumQualifier;

import javax.enterprise.inject.Default;

@Default
public class Mysql implements DatabaseService {
	@Override
	public String getDatabase() {
		return "Mysql works!";
	}
}
