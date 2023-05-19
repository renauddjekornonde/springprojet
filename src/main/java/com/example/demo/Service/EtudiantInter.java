package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Etudiant;

public interface EtudiantInter {
	
	public void ajouter(Etudiant etu);
	
	public void modifier(Etudiant etu);
	
	public List<Etudiant> liste();
	
	public Etudiant recherche(long id);
	
	public void delete(long id);
	
	

}
