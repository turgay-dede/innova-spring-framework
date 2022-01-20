package com.innova.enumQualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifierDB")
@ApplicationScoped
public class DatabaseManager {
	
	// Defaılt
	// @Inject
	// DatabaseService databaseService;
	
	@Inject
	@QualifierEnum(Database.MSSQL)
	DatabaseService databaseService;
	
	public String getDatabase() {
		return databaseService.getDatabase();
	}
}
