package com.training.example;

public class Main {

    public static void main(String[] args) {
        Cowboy cowboy = new Cowboy("Cowboy", "chelou");
        Brigand brigand = new Brigand("brigand", "bizarre");
        Dame dame = new Dame("Martine", "bleu");
        Barman barman = new Barman("joe", "bidule");
        Sheriff sheriff = new Sheriff("Morgan", "belliqueux");
        Ripoux ripoux = new Ripoux("Jeff", "agile");
        FemmeBrigand femmeBrigand = new FemmeBrigand("Jane", "noir");
        Indien indien = new Indien("agile", "aigle");

        indien.sePresenter();
        sheriff.sePresenter();
        barman.sePresenter();
        dame.sePresenter();
        cowboy.sePresenter();
        brigand.sePresenter();
        ripoux.sePresenter();
        femmeBrigand.sePresenter();
        dame.changerRobe("rose");
        dame.boire();
        brigand.capturer(dame);
        sheriff.rechercher(brigand);
        cowboy.tirer(brigand);
        cowboy.liberer(dame);
        ripoux.coffrer(brigand);
        ripoux.capturer(dame);
        cowboy.tirer(ripoux);
        sheriff.coffrer(ripoux);
        indien.scalper(cowboy);
        indien.sePresenter();
        dame.sePresenter();
        cowboy.sePresenter();
        brigand.sePresenter();
        sheriff.sePresenter();
    }
}
