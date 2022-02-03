package com.training.example;

public class Ripoux extends Sheriff implements HorsLaLoi{
    private int nbDames = 0;
    private boolean isEnPrison = false;
    private int prime = 100;

    public Ripoux(String nom, String adjectif) {
        super(nom, adjectif);
    }

    @Override
    public int getPrime() {
        return this.prime;
    }

    @Override
    public void capturer(Dame dame) {
        dame.seFaireKidnapper();
        this.nbDames++;
        this.parler("Ah ah ! " + dame.quelEstTonNom() +", tu es mienne désormais");
    }

    @Override
    public void seFaireEmprisonner(Cowboy cowboy) {
        this.isEnPrison = true;
        this.parler("Damned, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m’as eu !");
    }
}
