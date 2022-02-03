package com.training.example;

public class Humain {
    private String nom;
    private String boisson = "eau";

    public void Humain(String nom) {
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
        System.out.println("Ah ! un bon verre de " + this.getBoisson() + " ! GLOUPS !");
    }
}
