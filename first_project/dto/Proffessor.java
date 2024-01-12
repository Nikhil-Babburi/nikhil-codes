package com.nikhil.first.first_project.dto;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Proffessor {

    @Id
    @GeneratedValue
    Long id;
    String name;
    int age;
    String contactNumber;

    
}
