package com.demo.Controllers;

import com.demo.Entities.UserEntity;
import com.demo.Services.UserServices;
import com.sun.istack.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserServices userServices;
    @PostMapping(path = "/saveUser")
public UserEntity saveUser( @RequestBody  UserEntity userEntity){
    UserEntity newUserEntity=userServices.SaveUser(userEntity);
    return newUserEntity;
}

}
