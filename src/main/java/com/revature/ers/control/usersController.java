package com.revature.ers.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ers.pojo.UserPojo;
//import com.revature.ers.pojo.RequestPojo;
//import com.revature.ers.service.RequestService;
//import com.revature.ers.service.RequestServiceImpl;
import com.revature.ers.service.UserService;
//import com.revature.ers.service.UserServiceImpl;


@RestController
@RequestMapping("api/user")
public class usersController {
	@Autowired
	UserService userService;
	
	
	
	//http://localhost:4444/api/user/users
	@GetMapping("users")
 List<UserPojo> fetchAllAccounts(){
	return	userService.fetchAllAccounts();
		
	}
	//http://localhost:4444/api/user/users/1
	@GetMapping("users/{userId}")
	UserPojo fetchAAccount(@PathVariable("userId") int userId) {
	return	userService.fetchAAccount(userId);
	}
	//http://localhost:4444/api/user/updateUser
	@PutMapping("updateUser")
	UserPojo updateAccount(@RequestBody UserPojo userpojo) {
	return	userService.updateAccount(userpojo);
		
	}
	//http://localhost:4444/api/user/login
	@PostMapping("login")
	UserPojo login( @RequestBody UserPojo user) {
		return userService.login(user);
}

	
}


