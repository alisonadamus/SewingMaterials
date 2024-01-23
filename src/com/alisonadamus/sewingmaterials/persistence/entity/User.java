package com.alisonadamus.sewingmaterials.persistence.entity;

import com.alisonadamus.sewingmaterials.persistence.ErrorTemplates;
import com.alisonadamus.sewingmaterials.persistence.ValidationException;
import java.util.Objects;

public class User extends Entity {
    private static int counter = 0;
    private int id;
    private String login;
    private final String password;
    private String email;
    private Boolean admin;

    public User(String login, String password, String email) {
        this.id = ++counter;
        setLogin(login);
        this.password = password;
        this.email = email;
        this.admin = false;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {


        if(login.isBlank()){
            errors.add(ErrorTemplates.EMPTY_STRING.getTemplate());
        }
        if(login.length() < 4){
            errors.add(ErrorTemplates.MIN_LENGTH.getTemplate().formatted(4));
        }
        if(login.length() > 24){
            errors.add(ErrorTemplates.MAX_LENGTH.getTemplate().formatted(24));
        }

        if(!errors.isEmpty()){

        }

        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public String validatedPassword(String password){
        if(password.isBlank()){
            errors.add(ErrorTemplates.EMPTY_STRING.getTemplate());
        }
        if(password.length() < 8){
            errors.add(ErrorTemplates.MIN_LENGTH.getTemplate().formatted(4));
        }
        if(password.length() > 24){
            errors.add(ErrorTemplates.MAX_LENGTH.getTemplate().formatted(24));
        }

        if(!errors.isEmpty()){

        }

        return password;
    }
    public String getEmail() {
        return email;
    }

    public Boolean getAdmin() {
        return admin;
    }
}

