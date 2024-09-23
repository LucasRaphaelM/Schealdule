package com.taii.scheadule.respository;

import org.springframework.data.repository.CrudRepository;

import com.taii.scheadule.model.Agendamento;

public interface AgendamentoRepo extends CrudRepository <Agendamento, Integer> {
    
}
