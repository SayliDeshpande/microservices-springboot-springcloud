package com.myfirst.rest.services.restfulwebservices.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> list = new ArrayList<>();
	private static int userCount = 0;
	
	static {
		list.add(new User("Sayali", ++userCount, LocalDate.now().minusYears(32)));
		list.add(new User("Ameya", ++userCount, LocalDate.now().minusYears(37)));
		list.add(new User("Manasi", ++userCount, LocalDate.now().minusYears(30)));
		list.add(new User("Harshad", ++userCount, LocalDate.now().minusYears(26)));
	}
	
	
	public List<User> findAll(){
		return list;
	}
	
	public User getUser(int id) {
		return list.get(id);
	}
	
	public User save(User user) {
		user.setId(++userCount);
		list.add(user);
		return user;
	}


}
