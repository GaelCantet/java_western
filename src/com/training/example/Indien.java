package com.training.example;

public class Indien extends Humain{
    private String totem = "Coyote";
    private int nbPlumes = 0;

    public Indien(String nom, String totem) {
        super(nom, "jus de racine");
        this.totem = totem;
    }

    public void sePresenter() {
        super.sePresenter();
        this.parler("Je possède " + nbPlumes + " plumes.");
    }

    @Override
    public void parler(String texte) {
        super.parler(texte + " Ugh !");
    }

    @Override
    public String quelEstTonNom() {
        return this.totem + " " + super.quelEstTonNom();
    }

    public void scalper(VisagePale visagePale) {
        visagePale.scalp();
        this.nbPlumes++;
    }
}
