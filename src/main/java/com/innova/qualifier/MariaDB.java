package com.innova.qualifier;

import com.innova.alternative.DatabaseService;

@QualifierDatabase
public class MariaDB implements DatabaseService {
	
	@Override
	public String getDatabase() {
		return "MariaDB works!";
	}
	
}