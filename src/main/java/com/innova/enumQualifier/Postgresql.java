package com.innova.enumQualifier;

@QualifierEnum(Database.POSTGRESQL)
public class Postgresql implements DatabaseService {
	
	@Override
	public String getDatabase() {
		return "Postgresql works!";
	}
	
}
