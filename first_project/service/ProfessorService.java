package com.nikhil.first.first_project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nikhil.first.first_project.dto.Proffessor;
import com.nikhil.first.first_project.repository.ProffessorRepository;

@Service
public class ProfessorService {

    @Autowired
    ProffessorRepository proffessorRepository ;

    public List<Proffessor> getAllProffessors() {
        List<Proffessor> proffessors = new ArrayList <>();
       Iterable<Proffessor> allProffessors= proffessorRepository.findAll();
       for(Proffessor proffessor:allProffessors){
           proffessors.add(proffessor);
       }
       return proffessors;

    }

    public Proffessor getProffessorById(long id ){
     return proffessorRepository.getProffessorById(id);
    

    }

    

    public Proffessor addProffessor(Proffessor proffessor) {

         return  proffessorRepository.save(proffessor);
    } 


     public Proffessor updateProffessor(Proffessor proffessor ){
        return  proffessorRepository.save(proffessor);
         
     }

    
    
}
