/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cb.interfaces;

import cb.model.Reservaciones;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Edgar Ernesto M.
 * por buenas practicas se deja comentado el documento
 */
public interface InterfaceReservaciones extends CrudRepository<Reservaciones,Integer>{
    /**
     * Clase publica donde se maneja la interfaz
     * 
     * 
     */
}
