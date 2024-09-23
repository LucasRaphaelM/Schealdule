package com.taii.scheadule.respository;


import org.springframework.data.repository.CrudRepository;

import com.taii.scheadule.model.Medico;

public interface MedicoRepo extends CrudRepository<Medico, Integer>{
    
}
