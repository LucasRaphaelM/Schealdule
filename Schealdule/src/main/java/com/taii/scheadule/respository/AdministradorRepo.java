package com.taii.scheadule.respository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.taii.scheadule.model.Administradores;

public interface AdministradorRepo extends CrudRepository<Administradores, Integer>{
    

    @Query(value = "SELECT*FROM tbl_administradores WHERE email_adm = :email_adm AND senha_adm = MD5(:senha_adm)", nativeQuery = true)
    Administradores loginValidation(String email_adm, String senha_adm);

    
}
