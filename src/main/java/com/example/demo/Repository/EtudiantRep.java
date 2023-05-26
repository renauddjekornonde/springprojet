package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Etudiant;
@Component
public interface EtudiantRep extends JpaRepository<Etudiant, Long>{

}
