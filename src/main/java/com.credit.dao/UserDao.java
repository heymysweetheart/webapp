package com.credit.dao;


import com.credit.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by leo on 15/8/2.
 */
public interface UserDao {
    /**
     * insert a user object into the database
     * @param user
     * @return
     */
    public int insertUser(User user);

}
