package com.example.SoftwareManagementUsingSpring.model;

import java.util.List;

import com.example.SoftwareManagementUsingSpring.model.User;

public interface UserService {
	public void addUser(User obj);
	public List<User> findBlockByPRN(long PRN,String date);
	  public List<User> getAllBlocks();
}
