package com.training.example;

public class Brigand extends Humain {
    private String look = "méchant";
    private int nbDames = 0;
    private int prime = 100;
    private boolean isEnPrison = false;

    public Brigand(String nom) {
        super(nom);
    }

    public int getPrime() {
        return this.prime;
    }

    public void capturer(Dame dame) {
        dame.seFaireKidnapper();
        this.nbDames++;
        String texte = "Ah ah ! " + dame.quelEstTonNom() +", tu es mienne désormais";
        this.parler(texte);
    }

    public void seFaireEmprisonner() {
        this.isEnPrison = true;
        String texte = "Damned, je suis fait ! (Nom du cowboy), tu m’as eu !";
        this.parler(texte);
    }
}
