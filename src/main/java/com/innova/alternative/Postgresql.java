package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Postgresql implements DatabaseService {
	@Override
	public String getDatabase() {
		return "Postgresql works!";
	}
	
}
