package com.innova.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierDB")
@ApplicationScoped
public class DatabaseManager implements DatabaseService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	@QualifierDatabase
	private DatabaseService databaseService;
	
	@Override
	public String getDatabase() {
		return databaseService.getDatabase();
	}
	
}
