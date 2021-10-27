package com.bk.examportal;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bk.examportal.entity.Role;
import com.bk.examportal.entity.User;
import com.bk.examportal.entity.UserRole;
import com.bk.examportal.userservice.UserService;

@SpringBootApplication
public class ExamPortalApplication{

//	@Autowired 
//	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Starting code");
//	
//		
//		User user = new User();
//		user.setEmail("bhautik@gmail.com");
//		user.setFirstName("bhautik");
//		user.setLastName("koshiya");
//		user.setPassword("1235466");
//		user.setUserName("bhautik102");
//
//		user.setProfile("default.png");
//		
//		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//		
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUserName());
//		
//		
//		
		
		
		
		
		
				
		
		
		
	

}
