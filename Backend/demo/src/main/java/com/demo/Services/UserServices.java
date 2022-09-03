package com.demo.Services;

import com.demo.Entities.UserEntity;
import com.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;
public UserEntity SaveUser(UserEntity userEntity)
{
    return userRepository.save(userEntity);
}
}
