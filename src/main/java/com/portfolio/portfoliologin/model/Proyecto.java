
package com.portfolio.portfoliologin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter
@NoArgsConstructor
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreP;
    private String descripcion;
    private String img;

    public Proyecto(String nombreP, String descripcion, String img) {
        this.nombreP = nombreP;
        this.descripcion = descripcion;
        this.img = img;
    }
    
    
}
