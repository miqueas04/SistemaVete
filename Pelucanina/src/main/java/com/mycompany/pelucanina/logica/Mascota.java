
package com.mycompany.pelucanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
     
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE )
    private int num_cliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String observaciones;
    
    
    //Relacion 1 a 1 
    @OneToOne
    private Duenio unDuenio;

    
    //Constructors
    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String raza, String color, String alergico, String atencion_especial, String observaciones, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }
    
    //Getters and Setters

    public Object getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Object getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public Object getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
    
    
    
    
}
