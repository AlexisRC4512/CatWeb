package com.demo.Controllers;

import com.demo.Entities.LoginUserEntity;
import com.demo.Repositories.LoginUserRepository;
import com.demo.Services.LoginUserSevice;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.*;
 @WebMvcTest(LoginUserController.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class LoginUserControllerTest {
    @Mock
    private LoginUserRepository loginUserRepository;
    @MockBean
    private LoginUserSevice loginUserSevice;
    @InjectMocks
   private LoginUserController loginUserController;
    @Autowired
    private MockMvc mockMvc;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }
     MockHttpServletRequest request = new MockHttpServletRequest();
    @Test
    void when_loginUser_return_objectUser() throws Exception {

        LoginUserEntity objPrueba=new LoginUserEntity("Alexis123@hotmail.com","123456");
        Mockito.when(loginUserController.loginUser(request,objPrueba.getEmail(),objPrueba.getPassword())).thenReturn(objPrueba);
    }



 }