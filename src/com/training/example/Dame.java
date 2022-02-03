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
        System.out.println("AAAAAAH !");
    }

    public void seFaireLiberer() {
        this.isCaptive = false;
        System.out.println("Merci !");
    }

    public void changerRobe(String couleur) {
        this.couleurRobe = couleur;
        System.out.println("Regardez ma nouvelle robe " + this.couleurRobe + " !");
    }


}
