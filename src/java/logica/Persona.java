/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Leo Martinez
 */

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Persona {
    
    @Id
    private int dniP;
    private String nombreP;
    private String apellidoP;
    private String domicilioP;
    private String celular;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacio;

    public Persona() {
    }

    public Persona(int dniP, String nombreP, String apellidoP, String domicilioP, String celular, Date fechaNacio) {
        this.dniP = dniP;
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.domicilioP = domicilioP;
        this.celular = celular;
        this.fechaNacio = fechaNacio;
    }

    public int getDniP() {
        return dniP;
    }

    public void setDniP(int dniP) {
        this.dniP = dniP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getDomicilioP() {
        return domicilioP;
    }

    public void setDomicilioP(String domicilioP) {
        this.domicilioP = domicilioP;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFechaNacio() {
        return fechaNacio;
    }

    public void setFechaNacio(Date fechaNacio) {
        this.fechaNacio = fechaNacio;
    }

    @Override
    public String toString() {
        return "         Persona : " +  nombreP + " " + apellidoP + " (" + dniP + ") " 
           + "\n        Domicilio: " + domicilioP + "  Celular=" + celular 
           + "\n Fecha Nacimiento: " + fechaNacio ;
    }
    
    
    
    
}
