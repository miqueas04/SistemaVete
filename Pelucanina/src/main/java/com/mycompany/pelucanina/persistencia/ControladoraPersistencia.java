
package com.mycompany.pelucanina.persistencia;

import com.mycompany.pelucanina.logica.Duenio;
import com.mycompany.pelucanina.logica.Mascota;
import com.mycompany.pelucanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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

    public void borrarMascota(int num_cliente) throws NonexistentEntityException {
        
        mascoJpa.destroy(num_cliente);
        
        
    }

    public Mascota traerMascota(int num_cliente) {
        
      return  mascoJpa.findMascota(num_cliente);
    }

   
    public void Editar(Mascota masco) {
        
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Duenio buscarDuenio(int id_duenio) {
         return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio duno) {
       
        try {
            duenioJpa.edit(duno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    
     
    
}
