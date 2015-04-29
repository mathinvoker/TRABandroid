package com.praticas.matheus.easyride;

/**
 * Created by Matheus on 28/04/2015.
 */
public class Usuario {

    private String email;
    private String password;
    private String whatsapp;

    public Usuario(String email, String password, String whatsapp) {
        this.email = email;
        this.password = password;
        this.whatsapp = whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}
