/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Leo Martinez
 */
@Entity
public class Odontologo extends Persona implements Serializable{
    
    @Id
    private int idOdontologo;
    private String especialidad;
    
    @OneToOne
    private Usuario usr;
    
    @OneToMany
    private List<Turno> turnos;
    
    @OneToMany
    private List<Horario> horarios;
    

    public Odontologo() {
    }

 
    public Odontologo(int idOdontologo, String especialidad, Usuario usr
            , List<Turno> turnos, List<Horario> horarios, int dniP
            , String nombreP, String apellidoP, String domicilioP
            , String celular, Date fechaNacio) {
        super(dniP, nombreP, apellidoP, domicilioP, celular, fechaNacio);
        this.idOdontologo = idOdontologo;
        this.especialidad = especialidad;
        this.usr = usr;
        this.turnos = turnos;
        this.horarios = horarios;
    }
    
    

    public int getIdOdontologo() {
        return idOdontologo;
    }

    public void setIdOdontologo(int idOdontologo) {
        this.idOdontologo = idOdontologo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUsr() {
        return usr;
    }

    public void setUsr(Usuario usr) {
        this.usr = usr;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
    
    
    

    @Override
    public String toString() {
        return "Odontologo Nro." + idOdontologo 
          + "\n Especialidad: " + especialidad ;
    }
    
    
    
    
}
