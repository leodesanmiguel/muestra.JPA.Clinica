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
import javax.persistence.OneToOne;

/**
 *
 * @author Leo Martinez
 */
@Entity
public class Secretaria extends Persona implements Serializable{
    
    @Id
    private int idSecretaria;
    private String sector;
    
    @OneToOne
    private Usuario usr;

    public Secretaria() {
    }

    public Secretaria(int idSecretaria, String sector, Usuario usr
            , int dniP, String nombreP, String apellidoP
            , String domicilioP, String celular, Date fechaNacio) {
        super(dniP, nombreP, apellidoP, domicilioP, celular, fechaNacio);
        this.idSecretaria = idSecretaria;
        this.sector = sector;
        this.usr = usr;
    }

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUsr() {
        return usr;
    }

    public void setUsr(Usuario usr) {
        this.usr = usr;
    }

    @Override
    public String toString() {
        return "Secretaria del sector " + sector + " (" + usr + ")";
    }
    
    
    
}
