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


/**
 *
 * @author Leo Martinez
 */
@Entity
public class Responsable extends Persona implements Serializable {
    
    @Id
    private int idResponsable;
    private String tipoResponsable;

    public Responsable() {
        
    }

    

    public Responsable(int idResponsable, String tipoResponsable, int dniP
            , String nombreP, String apellidoP, String domicilioP
            , String celular, Date fechaNacio) {
        super(dniP, nombreP, apellidoP, domicilioP, celular, fechaNacio);
        this.idResponsable = idResponsable;
        this.tipoResponsable = tipoResponsable;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getTipoResponsable() {
        return tipoResponsable;
    }

    public void setTipoResponsable(String tipoResponsable) {
        this.tipoResponsable = tipoResponsable;
    }

    @Override
    public String toString() {
        return "Responsable: " +tipoResponsable + " ("+  idResponsable + ")";
    }
    
    
    
    
}
