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
public class Paciente extends Persona implements Serializable{
    
    @Id
    private int idPaciente;
    private boolean tieneOS;
    private String tipoSangre;
    
    @OneToOne
    private ObraSocial os;
    
    @OneToMany
    private List<Turno> turnos;
    
    @OneToMany
    private List<Responsable> responsables;

    
    public Paciente() {
    }

    
    public Paciente(int idPaciente, boolean tieneOS, String tipoSangre
            , ObraSocial os, List<Responsable> responsables, List<Turno> turnos, int dniP, String nombreP
            , String apellidoP, String domicilioP, String celular
            , Date fechaNacio) {
        super(dniP, nombreP, apellidoP, domicilioP, celular, fechaNacio);
        this.idPaciente = idPaciente;
        this.tieneOS = tieneOS;
        this.tipoSangre = tipoSangre;
        this.os = os;
        this.turnos = turnos;
        this.responsables = responsables;
        
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public boolean isTieneOS() {
        return tieneOS;
    }

    public void setTieneOS(boolean tieneOS) {
        this.tieneOS = tieneOS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public ObraSocial getOs() {
        return os;
    }

    public void setOs(ObraSocial os) {
        this.os = os;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public List<Responsable> getResponsables() {
        return responsables;
    }

    public void setResponsables(List<Responsable> responsables) {
        this.responsables = responsables;
    }

    
    @Override
    public String toString() {
        return "Paciente Nro." + idPaciente 
          + "\n  Obra Social: " + os  + ", tipoSangre=" + tipoSangre 
          + "\n       turnos:" + turnos ;
    }
    
    
    
}
