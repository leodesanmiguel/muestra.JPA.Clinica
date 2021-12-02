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
public class Usuario implements Serializable {
    
    @Id
    private int idUrs;
    private String nombreUsr;
    private String passwordUsr;

    public Usuario() {
    }

    public Usuario(int idUrs, String nombreUsr, String passwordUsr) {
        this.idUrs = idUrs;
        this.nombreUsr = nombreUsr;
        this.passwordUsr = passwordUsr;
    }

    public int getIdUrs() {
        return idUrs;
    }

    public void setIdUrs(int idUrs) {
        this.idUrs = idUrs;
    }

    public String getNombreUsr() {
        return nombreUsr;
    }

    public void setNombreUsr(String nombreUsr) {
        this.nombreUsr = nombreUsr;
    }

    public String getPasswordUsr() {
        return passwordUsr;
    }

    public void setPasswordUsr(String passwordUsr) {
        this.passwordUsr = passwordUsr;
    }

    @Override
    public String toString() {
        return "usr: " + nombreUsr ;
    }
    
    
    
}
