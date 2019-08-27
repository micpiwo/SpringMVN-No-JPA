/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre.controller;

import gestionlivre.Categorie;
import gestionlivre.Langue;
import gestionlivre.Livre;
import gestionlivre.service.ServiceLivre;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class LivreController {
    //Appel du service
    private ServiceLivre sl;

    public ServiceLivre getSl() {
        return sl;
    }

    public void setSl(ServiceLivre sl) {
        this.sl = sl;
    }
     
    @RequestMapping(value = "/formLivre", method = RequestMethod.GET)
    public ModelAndView livre() {
        Livre l = new Livre();
        l.setTitre("Spring");
        ModelAndView mav = new ModelAndView("livre", "command",l);
        //Appel de la methode get de l'interface => service
        mav.getModelMap().addAttribute("categorieList", sl.getCategorie());
        //Appel de la methode get de l'interface => service
        mav.getModelMap().addAttribute("langueList", sl.getLangue());
        return mav;
        
        
    }
    @RequestMapping(value = "/ajoutLivre", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Livre livre, ModelMap model) {
        model.addAttribute("titre", livre.getTitre());
        model.addAttribute("auteur", livre.getAuteur());
        model.addAttribute("categories", livre.getCategories());
        model.addAttribute("langue", sl.getLangue(livre.getLangue()).getLangueNom());
        sl.addLivre(livre);
        return "livreajoute";
    }

}
