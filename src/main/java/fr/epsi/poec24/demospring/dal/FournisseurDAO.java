package fr.epsi.poec24.demospring.dal;

import fr.epsi.poec24.demospring.domain.Fournisseur;

import java.util.List;

public interface FournisseurDAO {

    //C
    Fournisseur create(Fournisseur fournisseur);

    //R
    List<Fournisseur>  findAll();
    Fournisseur findById(int id);

    //U
    Fournisseur update(Fournisseur fournisseur);

    //D
    void delete(Fournisseur fournisseur);
}
