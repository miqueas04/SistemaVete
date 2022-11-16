
package com.mycompany.pelucanina.logica;

import com.mycompany.pelucanina.persistencia.ControladoraPersistencia;
import com.mycompany.pelucanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;



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

    public List<Mascota> traerMascotas() {
       
       return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) throws NonexistentEntityException {
       
       controlPersis.borrarMascota(num_cliente);
        
    }

    public Mascota traerMascota(int num_cliente) {
        
      return controlPersis.traerMascota(num_cliente);
        
        
    }

    

    public void editarDatos(Mascota masco, String nombreMasco, String color, String raza, String celDuenio, String nombreDuenio, String observaciones, String alergico, String atenEspe) {
       
        
        masco.setNombre(nombreMasco);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEspe);
        masco.setObservaciones(observaciones);
        
        //Moodificar mascota

       controlPersis.Editar(masco);
        
       //buscamos al dueño
       
       Duenio duno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        duno.setNombre(nombreDuenio);
        duno.setCel_duenio(celDuenio);
        
        this.modificarDuenio(duno);
    }

    private Duenio buscarDuenio(int id_duenio) {
       return controlPersis.buscarDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duno) {
       
        controlPersis.modificarDuenio(duno);
        
    }

    
        
        
    }


   
    

    
     
    
    
    

