package com.innova.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeDB")
@ApplicationScoped
public class DatabaseManager {
	
	@Inject // beans.xml de alternative class tanımlanır
	private DatabaseService databaseService;
	
	public String getDatabase() {
		return databaseService.getDatabase();
	}
	
}
