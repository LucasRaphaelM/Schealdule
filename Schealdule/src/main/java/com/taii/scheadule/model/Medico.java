package com.taii.scheadule.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_medico")
public class Medico {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private int id_Medico;


    public int getId_Medico() {
        return id_Medico;
    }


    public void setId_Medico(int id_Medico) {
        this.id_Medico = id_Medico;
    }



    //nome medico
    @Column(name = "nome_medico", nullable = false, length = 255)
    private String nome_Medico;


    public String getNome_Medico() {
        return nome_Medico;
    }


    public void setNome_Medico(String nome_Medico) {
        this.nome_Medico = nome_Medico;
    }



    //cpf medico
    @Column(name = "cpf_medico", nullable = false, length = 11)
    private String cpf_Medico;


    public String getCpf_Medico() {
        return cpf_Medico;
    }


    public void setCpf_Medico(String cpf_Medico) {
        this.cpf_Medico = cpf_Medico;
    }



    //crm medico
    @Column(name = "crm_medico", nullable = false, length = 6)
    private String crm_Medico;


    public String getCrm_Medico() {
        return crm_Medico;
    }


    public void setCrm_Medico(String crm_Medico) {
        this.crm_Medico = crm_Medico;
    }



    //telefone medico
    @Column(name = "telefone_medico", nullable = false, length = 11)
    private String telefone_medico;


    public String getTelefone_medico() {
        return telefone_medico;
    }


    public void setTelefone_medico(String telefone_medico) {
        this.telefone_medico = telefone_medico;
    }




    //especialidade medico
    @Column(name = "especialidade", nullable = false, length = 255)
    private String especialidade_medico;


    public String getEspecialidade_medico() {
        return especialidade_medico;
    }


    public void setEspecialidade_medico(String especialidade_medico) {
        this.especialidade_medico = especialidade_medico;
    }



    @OneToMany(mappedBy = "medico")
    private List<Agendamento> agendamentos;


    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }


    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }



    @OneToOne
    @JoinColumn(name = "id_agenda")
    private Agenda agenda;


    public Agenda getAgenda() {
        return agenda;
    }


    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

}
