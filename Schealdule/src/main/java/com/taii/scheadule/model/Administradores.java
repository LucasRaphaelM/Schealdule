package com.taii.scheadule.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_Administradores")
public class Administradores {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

@Column(name = "email_adm", nullable = false, length = 255)
    private String email_adm;


@Column(name = "senha_adm", nullable = false, length = 255)
    private String senha_adm;


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public String getEmail_adm() {
    return email_adm;
}


public void setEmail_adm(String email_adm) {
    this.email_adm = email_adm;
}


public String getSenha_adm() {
    return senha_adm;
}


public void setSenha_adm(String senha_adm) {
    this.senha_adm = senha_adm;
}

}