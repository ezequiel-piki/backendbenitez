package com.portfolio.portfoliologin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="habilidadUser")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Getter @Setter
public class Habilidad {
	
	@Id
                  @GeneratedValue(strategy=GenerationType.AUTO)
                   private Long id  ;
	
	
	private String name ;
	//private String image; 
	//private String level; 
	private String descripcion;    
	//private String marca;
	
	
	
	
}
