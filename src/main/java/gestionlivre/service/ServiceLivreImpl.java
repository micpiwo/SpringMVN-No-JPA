/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre.service;

import gestionlivre.Categorie;
import gestionlivre.Langue;
import gestionlivre.Livre;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class ServiceLivreImpl implements ServiceLivre{

    @Override
    public List<Langue> getLangue() {
        List<Langue> listeLangue = new ArrayList<Langue>();
        Langue langue = new Langue();
        langue.setLangueId(1);
        langue.setLangueNom("Français");
        listeLangue.add(langue);
        
        Langue langue2 = new Langue();
        langue2.setLangueId(2);
        langue2.setLangueNom("Anglais");
        listeLangue.add(langue2);
        
        Langue langue3 = new Langue();
        langue3.setLangueId(3);
        langue3.setLangueNom("Espagnol");
        listeLangue.add(langue3);
        
        return listeLangue;
        
    }

    @Override
    public List<Categorie> getCategorie() {
        List<Categorie> listeCategorie = new ArrayList<Categorie>();
        Categorie categorie = new Categorie();
        
        categorie.setCategorieId(1);
        categorie.setCategorieNom("Romans");
        listeCategorie.add(categorie);
        
        Categorie categorie2 = new Categorie();
        categorie2.setCategorieId(2);
        categorie2.setCategorieNom("Bande dessinée");
        listeCategorie.add(categorie2);
        
        Categorie categorie3 = new Categorie();
        categorie3.setCategorieId(3);
        categorie3.setCategorieNom("E-books");
        listeCategorie.add(categorie3);
        
        return listeCategorie;
    }

    @Override
    public boolean addLivre(Livre l) {
        return true;
    }

    @Override
    public boolean deleteLivre(Livre l) {
        return true;
    }

    @Override
    public List<Livre> getLivres() {
       return null;
    }

    @Override
    public Langue getLangue(int index) {
        Langue langue = new Langue();
        langue.setLangueId(1);
        langue.setLangueNom("Français");
        return langue;
    }

    @Override
    public Categorie getCategorie(int index) {
        Categorie categorie = new Categorie();
        categorie.setCategorieId(1);
        categorie.setCategorieNom("Roman");
        return categorie;
    }
    
}
