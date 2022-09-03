package com.demo.Services;

import com.demo.Entities.LoginUserEntity;
import com.demo.Repositories.LoginUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class LoginUserSeviceTest {
    @Mock
    LoginUserRepository loginUserRepository;
    @InjectMocks
    LoginUserSevice loginUserSevice;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    void emailRes() {
        LoginUserEntity objPrueba=new LoginUserEntity("Alexis123@hotmail.com","123456");
        Mockito.when(loginUserSevice.EmailRes("Alexis123@hotmail.com")).thenReturn(objPrueba);
    }
}