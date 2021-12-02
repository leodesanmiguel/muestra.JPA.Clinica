/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Leo Martinez
 */
@Entity
public class ObraSocial implements Serializable {
    
    @Id
    private int idOS;
    private String nombreOS;
    private String planCabertura;

    public ObraSocial() {
    }

    public ObraSocial(int idOS, String nombreOS, String planCabertura) {
        this.idOS = idOS;
        this.nombreOS = nombreOS;
        this.planCabertura = planCabertura;
    }

    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) {
        this.idOS = idOS;
    }

    public String getNombreOS() {
        return nombreOS;
    }

    public void setNombreOS(String nombreOS) {
        this.nombreOS = nombreOS;
    }

    public String getPlanCabertura() {
        return planCabertura;
    }

    public void setPlanCabertura(String planCabertura) {
        this.planCabertura = planCabertura;
    }

    @Override
    public String toString() {
        return "   ObraSocial: " + nombreOS.toUpperCase() +  "  (" + idOS + ")" 
          + "\n planCabertura: " + planCabertura.toUpperCase() ;
    }
    
    
    
}
