package com.taii.scheadule.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taii.scheadule.model.Usuario;

public interface PacienteRepo extends JpaRepository<Usuario, Integer>{
    
}
