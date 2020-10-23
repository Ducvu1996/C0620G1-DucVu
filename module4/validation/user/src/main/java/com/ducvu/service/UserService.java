package com.ducvu.service;

import com.ducvu.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    List<User> findAll( );

    User findById(Integer id);

    void save(User user);
    void delete(User user);


}
