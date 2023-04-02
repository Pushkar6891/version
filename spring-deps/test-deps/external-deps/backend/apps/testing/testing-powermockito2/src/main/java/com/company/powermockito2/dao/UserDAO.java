package com.company.powermockito2.dao;

import com.company.powermockito2.dto.User;
import com.company.powermockito2.util.IDGenerator;

public class UserDAO {
	
	public int create(User user){
		int id = IDGenerator.generateID();
		//Save the user object to the db
		return id;
		
		
	}

}
