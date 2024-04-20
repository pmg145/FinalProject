package com.dailycodework.lakesidehotel.service;

import org.hibernate.mapping.List;

import com.dailycodework.lakesidehotel.model.User;

/**
 * @author Simpson Alfred
 */

public interface IUserService {
    User registerUser(User user);
  //  List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
