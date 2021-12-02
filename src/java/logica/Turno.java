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
 * @author Leo Martinez
 */
@Entity
public class Turno implements Serializable {
    
    @Id
    private int idTurno;
    private String motivo;
    
    @Temporal(TemporalType.DATE)
    private Date diaTurno;
    
    @Temporal(TemporalType.TIME)
    private Date horaTurno;

    
    public Turno(){
        
    }
    
    public Turno(int idTurno, Date diaTurno, Date horaTurno, String motivo) {
        this.idTurno = idTurno;
        this.diaTurno = diaTurno;
        this.horaTurno = horaTurno;
        this.motivo = motivo;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getDiaTurno() {
        return diaTurno;
    }

    public void setDiaTurno(Date diaTurno) {
        this.diaTurno = diaTurno;
    }

    public Date getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(Date horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
       
        
        return "Turno Asignado Nro." + idTurno 
           + "\n  Fecha y Hora: " // + diaTurno.format(DateTimeFormatter.ISO_DATE)
                + " "; //+ horaTurno.format(DateTimeFormatter.ISO_TIME) ;
    }
    
    
    
    
}
