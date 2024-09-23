package com.taii.scheadule.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_paciente")
public class Paciente {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private int id_paciente;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }


    //nome paciente
    @Column(name = "nome_paciente", nullable = false, length = 255)
    private String nome_Paciente;

    public String getNome_Paciente() {
        return nome_Paciente;
    }

    public void setNome_Paciente(String nome_Paciente) {
        this.nome_Paciente = nome_Paciente;
    }


    //cpf paciente
    @Column(name = "cpf_paciente", nullable = false, length = 11)
    private String cpf_Paciente;

    public String getCpf_Paciente() {
        return cpf_Paciente;
    }

    public void setCpf_Paciente(String cpf_Paciente) {
        this.cpf_Paciente = cpf_Paciente;
    }



    //endereco paciente
    @Column(name = "endereco_paciente", nullable = false, length = 255)
    private String endereco_Paciente;

    public String getEndereco_Paciente() {
        return endereco_Paciente;
    }

    public void setEndereco_Paciente(String endereco_Paciente) {
        this.endereco_Paciente = endereco_Paciente;
    }



    //telefone paciente
    @Column(name = "telefone_paciente", nullable = false, length = 11)
    private String telefone_Paciente;

    public String getTelefone_Paciente() {
        return telefone_Paciente;
    }

    public void setTelefone_Paciente(String telefone_Paciente) {
        this.telefone_Paciente = telefone_Paciente;
    }



    //sexo paciente
    @Column(name = "sexo_paciente", nullable = false)
    private String sexo_Paciente;

    public String getSexo_Paciente() {
        return sexo_Paciente;
    }

    public void setSexo_Paciente(String sexo_Paciente) {
        this.sexo_Paciente = sexo_Paciente;
    }



    //one to many paciente
    @OneToMany(mappedBy = "paciente")
    private List<Agendamento> agendamentos;

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
}