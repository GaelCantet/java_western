package com.training.example;

public class Brigand extends Humain implements HorsLaLoi, VisagePale {
    private String look = "méchant";
    private int nbDames = 0;
    private int prime = 100;
    private boolean isEnPrison = false;

    public Brigand(String nom, String look) {
        super(nom, "tord-boyaux");
        this.look = look;
    }

    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + this.look;
    }

    public void sePresenter() {
        super.sePresenter();
        this.parler("J’ai l’air " + this.look + " et j’ai déjà kidnappé " + this.nbDames + " dames !");
        this.parler("Ma tête est mise à prix à " + this.getPrime() + "$ !");
    }

    @Override
    public int getPrime() {
        return this.prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
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

    public void scalp() {
        this.parler("Aïe ma tête !");
    }
}
