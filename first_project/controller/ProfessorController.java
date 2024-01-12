package com.nikhil.first.first_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.first.first_project.dto.Proffessor;
import com.nikhil.first.first_project.service.ProfessorService;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/proffessor")
@Slf4j

public class ProfessorController {

    @Autowired
    ProfessorService professorService ;


    // methods 

    @GetMapping("/get-all-proffessors")
    public ResponseEntity<List<Proffessor>> getAllProffessors(){

        Optional<List<Proffessor>> allProfessors = Optional.ofNullable(professorService.getAllProffessors());

        if(allProfessors.isPresent()){
            log.info("all proffessors ");
            return new ResponseEntity<>(allProfessors.get(),HttpStatus.OK);

        }else{
            log.info("not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }   
    }
    @GetMapping("/specific-proffessor/{id}")
    public Proffessor getProffessorById(@PathVariable long id){
       return professorService.getProffessorById(id);

    }

    





    @PostMapping("/add-proffessor")
    public ResponseEntity<Proffessor> addProffessor(@RequestBody Proffessor proffessor){
        Optional<Proffessor> proffessors= Optional.ofNullable(professorService.addProffessor(proffessor));

        if(proffessors.isPresent()){
            log.info("proffessor saved ");
            return new ResponseEntity<>(proffessors.get(),HttpStatus.OK);
        
        }else{
            log.info("proffessor not saved");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/update-proffessor/{id}")
    public Proffessor updateProffessor(@RequestBody Proffessor proffessor, @PathVariable long id ){
        return    professorService.updateProffessor(proffessor);

    }

  

}

