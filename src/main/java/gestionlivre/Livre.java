/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionlivre;

/**
 *
 * @author Administrateur
 */
public class Livre {

    private String titre;
    private String auteur;
    private int[] categories; 
    private int langue;

    /**
     * Get the value of langue
     *
     * @return the value of langue
     */
    public int getLangue() {
        return langue;
    }

    /**
     * Set the value of langue
     *
     * @param langue new value of langue
     */
    public void setLangue(int langue) {
        this.langue = langue;
    }


    /**
     * Get the value of categories
     *
     * @return the value of categories
     */
    public int[] getCategories() {
        return categories;
    }

    /**
     * Set the value of categories
     *
     * @param categories new value of categories
     */
    public void setCategories(int[] categories) {
        this.categories = categories;
    }

    /**
     * Get the value of categories at specified index
     *
     * @param index the index of categories
     * @return the value of categories at specified index
     */
    public int getCategories(int index) {
        return this.categories[index];
    }

    /**
     * Set the value of categories at specified index.
     *
     * @param index the index of categories
     * @param categories new value of categories at specified index
     */
    public void setCategories(int index, int categories) {
        this.categories[index] = categories;
    }

    /**
     * Get the value of titre
     *
     * @return the value of titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Set the value of titre
     *
     * @param titre new value of titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Get the value of auteur
     *
     * @return the value of auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Set the value of auteur
     *
     * @param auteur new value of auteur
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

}
