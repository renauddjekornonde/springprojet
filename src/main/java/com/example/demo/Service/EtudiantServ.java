package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Etudiant;
import com.example.demo.Repository.EtudiantRep;

@Component
@ComponentScan("com.example.demo.Repository")
@Service
public class EtudiantServ implements EtudiantInter{
	@Autowired
	private EtudiantRep er;

	@Override
	public void ajouter(Etudiant etu) {
		// TODO Auto-generated method stub
		etu= new Etudiant(etu.getPrenom(), etu.getNom(), etu.getNiveau(), etu.getFiliaire());
		er.save(etu);
		
	}

	@Override
	public void modifier(Etudiant etu) {
		// TODO Auto-generated method stub
		etu= new Etudiant(etu.getPrenom(), etu.getNom(), etu.getNiveau(), etu.getFiliaire());
		er.save(etu);
		
	}

	@Override
	public List<Etudiant> liste() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Etudiant recherche(long id) {
		// TODO Auto-generated method stub
		Optional<Etudiant> et= er.findById(id);
		Etudiant etu= null;
		if(et.isPresent()) {
			etu= et.get();
		}
		else {
			throw new RuntimeException("Etudiant not found for id  "+id);
		}
		return etu;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
		
	}

}
