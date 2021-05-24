package com.yj.mapper;


import com.yj.model.User;

import java.util.List;

public interface MediaAdAccountDao {


  public List<User> getUsers();


  User findUserById(int i);

}