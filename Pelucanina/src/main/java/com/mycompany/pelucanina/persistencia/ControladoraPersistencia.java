
package com.mycompany.pelucanina.persistencia;

import com.mycompany.pelucanina.logica.Duenio;
import com.mycompany.pelucanina.logica.Mascota;
import java.util.List;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardad(Duenio duenio, Mascota masco) {
       //Creamos en la BD el dueño y la mascota
        duenioJpa.create(duenio);
        mascoJpa.create(masco);
     
        
    }

    public List<Mascota> traerMascotas() {
      
        
      return  mascoJpa.findMascotaEntities();
        
    }
    
    
}
