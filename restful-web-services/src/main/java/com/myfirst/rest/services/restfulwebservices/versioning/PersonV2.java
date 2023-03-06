package com.myfirst.rest.services.restfulwebservices.versioning;

public class PersonV2 {
	
	private Name Name;

	public PersonV2(com.myfirst.rest.services.restfulwebservices.versioning.Name name) {
		super();
		Name = name;
	}

	public Name getName() {
		return Name;
	}

	public void setName(Name name) {
		Name = name;
	}
	
	

}
