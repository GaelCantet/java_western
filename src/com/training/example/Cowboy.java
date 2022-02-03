package com.training.example;

public class Cowboy extends Humain{
    private int popularite = 0;
    private String adjectif = "vaillant";

    public Cowboy(String nom, String adjectif) {
        super(nom, "whisky");
        this.adjectif = adjectif;
    }

    public void sePresenter() {
        super.sePresenter();
        this.parler("Les gens me trouvent " + this.adjectif);
        this.parler("Ma popularité en ce moment tourne autour de " + this.popularite);
    }

    public void setPopularite(int popularite) {
        this.popularite = popularite;
    }

    public void sExclame() {
        this.parler("Prends ça, rascal !");
    }

    public void liberer(Dame dame) {
        dame.seFaireLiberer(this);
        this.parler("J'adore le " + dame.getCouleurRobe());
    }

    public void tirer(Brigand brigand) {
        System.out.println("le " + this.adjectif + " " + this.quelEstTonNom() + " tire sur " + brigand.quelEstTonNom() + ". PAN !");
    }
}
