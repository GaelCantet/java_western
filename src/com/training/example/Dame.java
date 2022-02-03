package com.training.example;

public class Dame extends Humain{
    private String couleurRobe;
    private boolean isCaptive = false;

    public Dame(String nom, String couleur) {
        super(nom);
        this.couleurRobe = couleur;
    }

    public void seFaireKidnapper() {
        this.isCaptive = true;
        this.parler("AAAAAAH !");
    }

    public void seFaireLiberer() {
        this.isCaptive = false;
        this.parler("Merci !");
    }

    public void changerRobe(String couleur) {
        this.couleurRobe = couleur;
        String texte = "Regardez ma nouvelle robe " + this.couleurRobe + " !";
        this.parler(texte);
    }


}
