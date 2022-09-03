package com.demo.Services;

import com.demo.Entities.LoginUserEntity;
import com.demo.Repositories.LoginUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase Service de LoginUser que utiliza la interfaz LoginUserRepository
 * @author Alexis Ramos Cajo
 * @version 13/08/2022
 */
@Service
public class LoginUserSevice {
    @Autowired
    LoginUserRepository loginUserRepository;

    /**
     * Metodo publico EmilRes que devuelve un objeto LoginUserEntiry si el Email existe en la bd
     * @param Email unico parametro de tipo string
     * @return retorna un objeto LoginUserEntity
     */
    public LoginUserEntity EmailRes(String Email) {

            return loginUserRepository.findByEmail(Email);

    }
}
