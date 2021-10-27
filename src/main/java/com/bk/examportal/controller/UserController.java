package com.bk.examportal.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bk.examportal.entity.Role;
import com.bk.examportal.entity.User;
import com.bk.examportal.entity.UserRole;
import com.bk.examportal.userservice.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		Set<UserRole> roles = new HashSet<>();
		
		Role role =  new Role();
		role.setRoleId(45L);
		role.setRoleName("NORMAL");
		
		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		
		return this.userService.createUser(user, roles);
	}
	

	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") String userName) {
		return userService.findByUserName(userName);
	}
	
	@PutMapping("/{userName}")
	public User updateUser(@RequestBody User user) {

		return userService.updateUser(user);
	}
	
	@DeleteMapping("/{userName}")
	public void deleteUser(@PathVariable("userName") String userName) {
		userService.deleteUser(userName);
	}
	
}
