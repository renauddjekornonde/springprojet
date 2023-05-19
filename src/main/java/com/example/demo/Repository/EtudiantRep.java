package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Etudiant;

public interface EtudiantRep extends JpaRepository<Etudiant, Long>{

}
