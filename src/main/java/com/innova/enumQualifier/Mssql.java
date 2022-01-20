package com.innova.enumQualifier;

@QualifierEnum(Database.MSSQL)
public class Mssql implements DatabaseService {
	
	@Override
	public String getDatabase() {
		// TODO Auto-generated method stub
		return "Mssql works!";
	}
	
}
