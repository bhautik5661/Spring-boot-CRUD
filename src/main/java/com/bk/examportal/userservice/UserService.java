package com.bk.examportal.userservice;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.bk.examportal.entity.User;
import com.bk.examportal.entity.UserRole;

public interface UserService {

	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	public User findByUserName(String username);
	
	public User updateUser(User user);
	
	public void deleteUser(String userName);
}
