package com.taii.scheadule.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taii.scheadule.model.Agenda;


public interface AgendaRepo extends JpaRepository<Agenda, Integer>{
    
}
