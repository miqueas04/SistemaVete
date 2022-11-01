
package com.mycompany.pelucanina.logica;

import com.mycompany.pelucanina.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

   
    public void guardar(String nombreMasco, String color, String raza, String celDuenio, String nombreDuenio, String observaciones, String alergico, String atenEspe) {
        
        //Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        
        duenio.setNombre(nombreDuenio);
        duenio.setCel_duenio(celDuenio);
        
        
        
        //Creamos la mascota y asignamos sus valores 
        Mascota masco = new Mascota();
        
        masco.setNombre(nombreMasco);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEspe);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardad(duenio, masco);
        
    }
     
    
    
    
}
