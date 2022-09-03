package com.demo.Controllers;

import com.demo.Entities.LoginUserEntity;
import com.demo.Services.LoginUserSevice;
import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;

/**
 * Clase controler de LoginUserEntity
 * que utiliza LoginUserService
 * @author Alexis Ramos Cajo
 * @version 13/08/2022
 */
@RestController
@RequestMapping("/LoginUser")
public class LoginUserController {
    @Autowired
    LoginUserSevice loginUserSevice;
    @GetMapping("/Login")
    public LoginUserEntity loginUser(HttpServletRequest request, @RequestParam(value="Email" )  String email , @RequestParam(value = "password")String password ) {
        LoginUserEntity objUsuarioBDCorreo = loginUserSevice.EmailRes(email);

        if (objUsuarioBDCorreo!=null && password.equals(objUsuarioBDCorreo.getPassword())) {

            return objUsuarioBDCorreo;

        }
        else {
            return null;
        }

    }
}
