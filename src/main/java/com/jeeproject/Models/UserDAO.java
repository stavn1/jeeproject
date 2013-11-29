package com.jeeproject.Models;

import com.jeeproject.Entities.User;

public interface UserDAO {


public void AddUser(User newUser);
public User ConnectUser(String username, String psswd);
public boolean CheckEmailAvailable(String username);
public boolean CheckUsernameAvailable(String email);
}
