/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import java.sql.Time;
import java.util.Date;



import persistencia.ControlDePersistencia;

/**
 *
 * @author Leo Martinez
 */
public class Controladora {
    
    ControlDePersistencia ctrlP = new ControlDePersistencia();
    
    public void crearTurno(){
        
        Date hoy =  new Date(1996, 12, 25);
        Time ahora = new Time(10, 30, 25);
        
        Turno turno = new Turno(1, hoy, ahora, "Primero Intento");
        
        ctrlP.crearTurno(turno);
        
    }
    
}
