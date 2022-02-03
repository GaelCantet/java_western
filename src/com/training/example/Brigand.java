package com.training.example;

public class Brigand extends Humain {
    private String look = "méchant";
    private int nbDames = 0;
    private int prime = 100;
    private boolean isEnPrison = false;

    public Brigand(String nom, String look) {
        super(nom);
        this.look = look;
    }

    public int getPrime() {
        return this.prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public void capturer(Dame dame) {
        dame.seFaireKidnapper();
        this.nbDames++;
        this.parler("Ah ah ! " + dame.quelEstTonNom() +", tu es mienne désormais");
    }

    public void seFaireEmprisonner(Cowboy cowboy) {
        this.isEnPrison = true;
        this.parler("Damned, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m’as eu !");
    }
}
