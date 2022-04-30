package com.genaration.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="tb_postagens")

public class Postagem {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="atributo titulo é obrigatorio") // obrigado a prencher espaços em branco 
	@Size(min=5, max=100, message= "atributo tiulo deve conter no minino 5 e no maximo 100 caracteres ")
	private String titulo;
	
	@NotNull (message = "atributo texto é obrigatorio !" )
	@Size(min=5, max= 1000, message= "atributo texto deve conter no minimo 5 a 100 caracteres !")
	private String texto;
	
	@UpdateTimestamp
	private  LocalDateTime data ; 
}
