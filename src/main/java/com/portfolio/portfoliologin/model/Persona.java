
package com.portfolio.portfoliologin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 50, message = "no cumple con la cantidad de caracteres")
    private String nombre;
    
    @NotNull
    @Size(min = 3, max = 50, message = "no cumple con la cantidad de caracteres")
    private String apellido;
   
     @NotNull
    private String descripcion;
    
     private String img;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String descripcion, String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
    }
    
    
    
}
