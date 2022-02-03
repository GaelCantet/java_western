package com.training.example;

public class Main {

    public static void main(String[] args) {
        Cowboy cowboy = new Cowboy("Cowboy", "chelou");
        Brigand brigand = new Brigand("brigand", "bizarre");
        Dame dame = new Dame("Martine", "bleu");
        Barman barman = new Barman("joe", "bidule");
        Sheriff sheriff = new Sheriff("Morgan", "belliqueux");

        sheriff.sePresenter();
        barman.sePresenter();
        dame.sePresenter();
        cowboy.sePresenter();
        brigand.sePresenter();
        dame.changerRobe("rose");
        dame.boire();
        brigand.capturer(dame);
        sheriff.rechercher(brigand);
        cowboy.tirer(brigand);
        cowboy.liberer(dame);
        sheriff.coffrer(brigand);
        dame.sePresenter();
        cowboy.sePresenter();
        brigand.sePresenter();
        sheriff.sePresenter();
    }
}
