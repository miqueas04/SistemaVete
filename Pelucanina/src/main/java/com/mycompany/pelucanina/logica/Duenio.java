
package com.mycompany.pelucanina.logica;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity                 
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE )
    private int id_duenio;
    private String celDuenio;
    private String nombre;

    
    //Constructors 
    public Duenio() {
    }

    public Duenio(int id_duenio, String celduenio, String nombre) {
        this.id_duenio = id_duenio;
        this.celDuenio = celduenio;
        this.nombre = nombre;
    }

    
    // Get and Setts
    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getCel_duenio() {
        return celDuenio;
    }

    public void setCel_duenio(String cel_duenio) {
        this.celDuenio = cel_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
