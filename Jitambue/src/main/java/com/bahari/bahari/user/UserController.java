package com.bahari.bahari.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bahari.bahari.shared.GenericResponse;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/api/1.0/users") 
	GenericResponse createUsers(@RequestBody User user) {
		userService.save(user);//it now saves user in the db	
		return new GenericResponse("User saved");
		
	}
}
