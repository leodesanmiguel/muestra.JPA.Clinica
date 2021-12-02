/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import logica.Turno;

/**
 *
 * @author Leo Martinez
 */
public class ControlDePersistencia {

    HorarioJpaController horaJpa = new HorarioJpaController();
    ObraSocialJpaController osJPA = new ObraSocialJpaController();
    OdontologoJpaController odonJPA = new OdontologoJpaController();
    PacienteJpaController paciJPA = new PacienteJpaController();
    ResponsableJpaController respJPA = new ResponsableJpaController();
    SecretariaJpaController secrJPA = new SecretariaJpaController();
    TurnoJpaController turnJPA = new TurnoJpaController();
    UsuarioJpaController usrJPA = new UsuarioJpaController();

    public void crearTurno(Turno turno) {
        try {
            turnJPA.create(turno);

        } catch (Exception e) {
            System.out.println("NO PUDO CREAR EL TURNO \n" + e);
        }
    }
}
