package com.training.example;

public class Humain {
    protected String nom;
    protected String boisson = "eau";

    public Humain(String nom) {
        this.nom = nom;
    }

    protected String quelEstTonNom() {
        return this.nom;
    }

    protected String getBoisson() {
        return this.boisson;
    }

    protected void sePresenter() {
        System.out.println("Bonjour. " + this.quelEstTonNom() + ". " + this.getBoisson() + ".");
    }

    protected void parler(String texte) {
        System.out.println("(" + this.quelEstTonNom() + ") - " + texte);
    }

    protected void boire() {
        String texte = "Ah ! un bon verre de " + this.getBoisson() + " ! GLOUPS !";
        this.parler(texte);
    }
}
