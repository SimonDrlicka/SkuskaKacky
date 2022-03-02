package sk.sdrlicka.player;

import sk.sdrlicka.kacka.Kacka;

public class Player {
    private String name;
    private int pocetKaciek;

    public Player(String name) {
        this.name = name;
        this.pocetKaciek = 0;
    }

    public Kacka addKacka(){
        pocetKaciek++;
        return new Kacka(this);
    }

    public int getPocetKaciek() {
        return pocetKaciek;
    }

    public String getName() {
        return name;
    }
    public void decrementKacky(){
        pocetKaciek--;
    }
}
