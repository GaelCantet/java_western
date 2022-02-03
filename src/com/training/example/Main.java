package com.training.example;

public class Main {

    public static void main(String[] args) {
        Cowboy cowboy = new Cowboy("Cowboy", "chelou");
        Brigand brigand = new Brigand("brigand", "bizarre");
        Dame dame = new Dame("Martine", "bleu");

        dame.changerRobe("rose");
        dame.boire();
        brigand.capturer(dame);
        cowboy.tirer(brigand);
        cowboy.liberer(dame);
        brigand.seFaireEmprisonner(cowboy);
    }
}
