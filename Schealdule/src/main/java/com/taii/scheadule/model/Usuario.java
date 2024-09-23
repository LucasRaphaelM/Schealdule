package com.taii.scheadule.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private int id_Cliente;

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    @Column(name = "email_cliente", nullable = false, length = 120)
    private String email_Cliente;

    public String getEmail_Cliente() {
        return email_Cliente;
    }

    public void setEmail_Cliente(String email_Cliente) {
        this.email_Cliente = email_Cliente;
    }


    @Column(name = "senha_cliente", nullable = false)
    private String senha_Cliente;

    public String getSenha_Cliente() {
        return senha_Cliente;
    }

    public void setSenha_Cliente(String senha_Cliente) {
        this.senha_Cliente = senha_Cliente;
    }
}