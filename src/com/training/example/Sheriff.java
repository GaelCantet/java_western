package com.training.example;

public class Sheriff extends Cowboy{
    private int nbBrigands = 0;

    public Sheriff(String nom, String adjectif) {
        super(nom, adjectif);
    }

    @Override
    public String quelEstTonNom() {
        return "Shériff " + super.quelEstTonNom();
    }

    public void sePresenter() {
        super.sePresenter();
        this.parler("J'ai déjà coffré " + this.nbBrigands + " bandits.");
    }

    public void coffrer(Brigand brigand) {
        this.nbBrigands++;
        this.parler("Au nom de la loi, je vous arrête !");
        brigand.seFaireEmprisonner(this);
    }


    public void rechercher(Brigand brigand) {
        this.parler("OYEZ OYEZ BRAVE GENS !! " + brigand.getPrime() + " $ a qui arrêtera " + brigand.quelEstTonNom() + ", mort ou vif !!");
    }
}
