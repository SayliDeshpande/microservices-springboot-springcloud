package com.myfirst.rest.services.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	// versioning based on URI
	@GetMapping("v1/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Sayali Ameya");
	}
	
	// versioing based on URI , different URI for different version
	@GetMapping("v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Sayali", "Ameya"));
	}
	
	// versioning based on request parameters 
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getPersonRequestParamsV1() {
		return new PersonV1("Sayali Ameya");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getPersonRequestParamsV2() {
		return new PersonV2(new Name("Sayali", "Ameya"));
	}
	
	
	

}
