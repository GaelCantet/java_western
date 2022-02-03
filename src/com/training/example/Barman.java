package com.training.example;

public class Barman extends Humain{
    private String nomDuBar;

    public Barman(String nom) {
        super(nom, "vin");
        this.nomDuBar = "Chez " + super.quelEstTonNom();
    }

    public Barman(String nom, String nomDuBar) {
        super(nom, "vin");
        this.nomDuBar = nomDuBar;
    }

    public void parler(String texte) {
        super.parler(texte + ", Coco");
    }

    public void sePresenter() {
        super.sePresenter();
        this.parler("Mon bar s'appelle " + this.nomDuBar);
    }
}
