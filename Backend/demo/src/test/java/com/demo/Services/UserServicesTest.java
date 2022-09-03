package com.demo.Services;

import com.demo.Entities.LoginUserEntity;
import com.demo.Entities.UserEntity;
import com.demo.Repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;

import javax.persistence.Entity;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class UserServicesTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServices userServices;
    LoginUserEntity loginUserEntity=new LoginUserEntity("Alexis111@hotmai.com","123456");
    UserEntity userEntity= new UserEntity("Juan","Robles","adasdsadas",9928123,loginUserEntity);
    @BeforeEach
    void setUp() {
    }
    @Test
    public void testCreateOrSaveUser()
    {
        userServices.SaveUser(userEntity);
        Mockito.verify(userRepository,Mockito.times(1)).save(userEntity);
    }
}