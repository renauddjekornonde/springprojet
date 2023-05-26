package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.Etudiant;
import com.example.demo.Service.EtudiantServ;

@Component
@ComponentScan("com.example.demo.Service")
@Controller

public class EtudiantController {
	@Autowired
	EtudiantServ es;
	
	@GetMapping("/")
	public String afficheHome(Model model) {
		return "admin/auth/welcome";
	}
	

	@GetMapping("/newUser")
	public String showRegistretionForm(Model model) {
		Etudiant etudiant=new Etudiant();
		model.addAttribute("etudiant", etudiant);
		return "admin/auth/newUser";
	}
	
	@PostMapping("/newUser/save")
	public String registrationForm(@ModelAttribute("etudiant") Etudiant etudiant, BindingResult result, Model model){
		es.ajouter(etudiant);
		return "redirect:/listeUser"; //on peut egalement faire : return "redirect:/newUser?success"
		
	}
	
	@GetMapping(path="/liste")
	public String showListeUser(Model model) {
		model.addAttribute("allUserListe", es.liste());
		return "admin/auth/listeUser";
	}
	
	@GetMapping(path="editEtudiant/{id}")
	public String updateForm(Model model, @PathVariable("id") long id) {
		Etudiant etudiant=es.recherche(id);
		model.addAttribute("etudiant", etudiant);
		return "admin/auth/newUser";
	}
	
	@GetMapping("/deleteUser/{id}")
	public String deleteEtudiantById(@PathVariable(value="id") long id) {
		es.delete(id);
		return "redirect:listeUser";
	}

}
