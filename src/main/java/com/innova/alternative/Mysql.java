package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mysql implements DatabaseService {
	
	@Override
	public String getDatabase() {
		return "Mysql works!";
	}
	
}
