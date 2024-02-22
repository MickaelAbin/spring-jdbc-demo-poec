package fr.epsi.poec24.demospring.controller;

import fr.epsi.poec24.demospring.domain.Fournisseur;
import fr.epsi.poec24.demospring.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/fournisseurs")
public class FournisseurController {

    private FournisseurService service;

    @Autowired
    public FournisseurController(FournisseurService service) {
        this.service = service;
    }

    @GetMapping
    public String afficherListeFournisseur(Model model){
        List<Fournisseur> mesFournisseurs = service.findAll();
        model.addAttribute("fournisseurs",mesFournisseurs);
        return"view-fournisseur" ;
    }

    @PostMapping("/creer")
    public String creerFournisseur(){
        return"" ;
    }
}

