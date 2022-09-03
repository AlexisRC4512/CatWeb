package com.demo.Entities;

import javax.persistence.*;

/**
 * @author Alexis Ramos Cajo
 * @version 23/08/2022
 */
@Entity
@Table (name = "tb_User")
public class UserEntity {

    @Id
    @Column (name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "name")
    private String name;
    @Column (name = "lastName")
    private String lastName;
    @Column (name = "Address")
    private String Address;
    @Column (name = "phone")
    private int phone;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LoginID",referencedColumnName = "id")
    private LoginUserEntity LoginId;

    public UserEntity( String name, String lastName, String address, int phone, LoginUserEntity loginId) {
        this.name = name;
        this.lastName = lastName;
        Address = address;
        this.phone = phone;
        LoginId = loginId;
    }


    public UserEntity() {}


    @Override
    public String toString() {
        return "UserService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Address='" + Address + '\'' +
                ", phone=" + phone +
                ", LoginId=" + LoginId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public LoginUserEntity getLoginId() {
        return LoginId;
    }

    public void setLoginId(LoginUserEntity loginId) {
        LoginId = loginId;
    }
}
