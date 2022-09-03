package com.demo.Controllers;

import com.demo.Entities.LoginUserEntity;
import com.demo.Entities.UserEntity;
import com.demo.Services.UserServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.BasicJsonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
class UserControllerTest {

    LoginUserEntity loginUserEntity=new LoginUserEntity(3,"Alexis111@hotmai.com","123456");
    UserEntity userEntity= new UserEntity("Juan","Robles","adasdsadas",9928123,loginUserEntity);
    @MockBean
    UserServices userServices;
    @Autowired
    MockMvc mockMvc;


    @Test
   public void createOrSaveUserController() throws Exception {
        Mockito.when(userServices.SaveUser(userEntity)).thenReturn(userEntity);
        Map<String,Object>objUser=new HashMap<>();
        objUser.put("name","Aleis");
        objUser.put("lastName","joj");
        objUser.put("Address","asdasdasd");
        objUser.put("phone",98441232);
        objUser.put("LoginId",loginUserEntity);
        ObjectMapper objectMapper = new ObjectMapper();
        mockMvc.perform(MockMvcRequestBuilders.post("/User/saveUser").contentType(MediaType.APPLICATION_JSON).
                content(objectMapper.writeValueAsString(objUser))).andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk());

    }
}