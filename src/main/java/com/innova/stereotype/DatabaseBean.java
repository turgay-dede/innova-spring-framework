package com.innova.stereotype;

@InnovaMultipleAnnotation
public class DatabaseBean {
	private String databaseName;
	
	public String getDatabaseName() {
		return databaseName;
	}
	
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	
}
