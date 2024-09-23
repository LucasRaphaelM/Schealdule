package com.taii.scheadule.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taii.scheadule.model.Usuario;

public interface UsuarioRepo extends JpaRepository <Usuario, Integer>{
    
    @Query(value = "SELECT*FROM tbl_usuario WHERE email = :email AND senha = MD5(:senha)", nativeQuery = true)
    public Usuario loginValidation(String email, String senha);
}
