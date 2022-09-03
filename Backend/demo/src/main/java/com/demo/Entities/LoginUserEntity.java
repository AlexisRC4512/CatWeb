package com.demo.Entities;

import javax.persistence.*;

/**
 * Clase Entity LoginUser mapea con jpa la tabla tb_Login user
 * @author Alexis Ramos Cajo
 * @version 13/08/2022
 */
@Entity
@Table(name = "tb_LoginUser")
public class LoginUserEntity {
    //campos de la clase
    @Id
    @Column(name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
     private Integer Id ;
    @Column(name = "email")
    private String email;
    @Column (name = "password")
    private String Password;

    /**
     * Constructor de la clase LoginUser
     * @param id es identity no se necesita llamar
     * @param email correo de inicio de sesion
     * @param password contraseña con tamaño maximo de 20 caracteres
     */
    public LoginUserEntity(int id, String email, String password) {
        Id = id;
        email = email;
        Password = password;
    }
    public LoginUserEntity(String email, String password) {
        email = email;
        Password = password;
    }
    /**
     * Constructor vacio
     */
    public LoginUserEntity() {}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
