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
@Table(name="tbl_agenda")
public class Agenda {
    
    //um pra um medico e agenda
    @OneToMany(mappedBy = "agenda")
    private List<Medico> medico;


    
    //id automatico
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    //boolean para verificar se dia ativo ou inativo para medico
    @Column(name = "segunda", nullable = false, length = 2)
    private boolean segunda;

    public boolean isSegunda() {
        return segunda;
    }

    public void setSegunda(boolean segunda) {
        this.segunda = segunda;
    }


    //boolean para verificar se dia ativo ou inativo para medico
    @Column(name = "terca", nullable = false, length = 2)
    private boolean terca;



    public boolean isTerca() {
        return terca;
    }

    public void setTerca(boolean terca) {
        this.terca = terca;
    }


    //boolean para verificar se dia ativo ou inativo para medico
    @Column(name = "quarta", nullable = false, length = 2)
    private boolean quarta;


    public boolean isQuarta() {
        return quarta;
    }

    public void setQuarta(boolean quarta) {
        this.quarta = quarta;
    }


    //boolean para verificar se dia ativo ou inativo para medico
    @Column(name = "quinta", nullable = false, length = 2)
    private boolean quinta;


    public boolean isQuinta() {
        return quinta;
    }

    public void setQuinta(boolean quinta) {
        this.quinta = quinta;
    }


    //boolean para verificar se dia ativo ou inativo para medico
    @Column(name = "sexta", nullable = false, length = 2)
    private boolean sexta;


    public boolean isSexta() {
        return sexta;
    }

    public void setSexta(boolean sexta) {
        this.sexta = sexta;
    }


    //boolean para verificar se dia ativo ou inativo para medico
    @Column(name = "sabado", nullable = false, length = 2)
    private boolean sabado;


    public boolean isSabado() {
        return sabado;
    }

    public void setSabado(boolean sabado) {
        this.sabado = sabado;
    }


    //boolean para verificar se dia ativo ou inativo para medico
    @Column(name = "domingo", nullable = false, length = 2)
    private boolean domingo;

    public boolean isDomingo() {
        return domingo;
    }

    public void setDomingo(boolean domingo) {
        this.domingo = domingo;
    }
}
