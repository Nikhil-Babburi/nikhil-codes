package com.nikhil.first.first_project.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.first.first_project.dto.Proffessor;

@Repository
public interface ProffessorRepository extends CrudRepository<Proffessor , Long> {




    public Proffessor getProffessorById(long id);

    
   

   
    
}
