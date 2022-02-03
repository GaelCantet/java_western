package com.training.example;

public class Humain {
    private String nom;
    private String boisson = "eau";

    public Humain(String nom, String boisson) {
        this.nom = nom;
        this.boisson = boisson;
    }

    protected String quelEstTonNom() {
        return this.nom;
    }

    protected String getBoisson() {
        return this.boisson;
    }

    protected void sePresenter() {
        this.parler("Bonjour, je suis " + this.quelEstTonNom() + " et j'aime le " + this.getBoisson() + ".");
    }

    protected void parler(String texte) {
        System.out.println("(" + this.quelEstTonNom() + ") - " + texte);
    }

    protected void boire() {
        this.parler("Ah ! un bon verre de " + this.getBoisson() + " ! GLOUPS !");
    }
}
