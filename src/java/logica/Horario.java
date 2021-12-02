/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Leo martinez
 */
@Entity
public class Horario implements Serializable {
    
    @Id
    private int idHorario;
    private String diaSemana;
    
    @Temporal(TemporalType.TIME)
    private Date horaEntra;
    @Temporal(TemporalType.TIME)
    private Date horaSale;

    public Horario() {
    }

    public Horario(int idHorario, Date horaEntra, Date horaSale, String diaSemana) {
        this.idHorario = idHorario;
        this.horaEntra = horaEntra;
        this.horaSale = horaSale;
        this.diaSemana = diaSemana;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public Date getHoraEntra() {
        return horaEntra;
    }

    public void setHoraEntra(Date horaEntra) {
        this.horaEntra = horaEntra;
    }

    public Date getHoraSale() {
        return horaSale;
    }

    public void setHoraSale(Date horaSale) {
        this.horaSale = horaSale;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return "Horario : " +  idHorario + " Dia: " + diaSemana
                + " Desde: "  + horaEntra + "  Hasta: "+ horaSale ;
    }
    
    
    
    
}


