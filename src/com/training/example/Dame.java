package com.training.example;

public class Dame extends Humain{
    private String couleurRobe;
    private boolean isCaptive = false;

    public Dame(String nom, String couleur) {
        super(nom, "lait");
        this.couleurRobe = couleur;
    }

    @Override
    public String quelEstTonNom() {
        return "Miss " + super.quelEstTonNom();
    }

    public void sePresenter() {
        super.sePresenter();
        this.changerRobe(this.couleurRobe);
    }

    public boolean isCaptive() {
        return this.isCaptive;
    }

    public String getCouleurRobe() {
        return this.couleurRobe;
    }

    public void seFaireKidnapper() {
        this.isCaptive = true;
        this.parler("AAAAAAH !");
    }

    public void seFaireLiberer(Cowboy cowboy) {
        this.isCaptive = false;
        this.parler("Merci " + cowboy.quelEstTonNom() + "!");
    }

    public void changerRobe(String couleur) {
        this.couleurRobe = couleur;
        this.parler("Regardez ma nouvelle robe " + this.couleurRobe + " !");
    }


}
