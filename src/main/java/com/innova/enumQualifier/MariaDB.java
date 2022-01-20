package com.innova.enumQualifier;

@QualifierEnum(Database.MARIADB)
public class MariaDB implements DatabaseService {
	
	@Override
	public String getDatabase() {
		return "MariaDB works!";
	}
	
}
