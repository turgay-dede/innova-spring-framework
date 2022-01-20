package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MariaDB implements DatabaseService {
	
	@Override
	public String getDatabase() {
		return "MariaDB works!";
	}
	
}
