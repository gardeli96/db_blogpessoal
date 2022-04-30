package com.genaration.blogpessoal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.genaration.blogpessoal.model.Postagem;



@Repository

public interface PostagemRepository extends JpaRepository <Postagem,Long>{

	
	}
