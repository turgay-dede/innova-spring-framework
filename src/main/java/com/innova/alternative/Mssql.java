package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mssql implements DatabaseService {
	@Override
	public String getDatabase() {
		return "Mssql works!";
	}
}
