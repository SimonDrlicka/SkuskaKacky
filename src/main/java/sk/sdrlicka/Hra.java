package sk.sdrlicka;

import sk.sdrlicka.kacka.Kacka;
import sk.sdrlicka.player.Player;
import sk.sdrlicka.utils.KeyboardInput;
import sk.sdrlicka.utils.Zklavesnice;

import java.util.ArrayList;
import java.util.Random;

public class Hra {
    private ArrayList<Player> players;
    private ArrayList<Kacka> kacky;
    private Player current;
    public Hra(){
        players = new ArrayList<>();
        kacky = new ArrayList<>();
        init();
        System.out.println("kkt");
        killRandomKacka();
        printKacky();
        printPocetKaciek();
    }
    public void printPocetKaciek(){
        for(Player p: players){
            System.out.println(p.getName() + " " +p.getPocetKaciek());
        }
    }

    public void killRandomKacka(){
        Random r = new Random();
        int randomN = r.nextInt(kacky.size()); // kacka1,kacka2 size = 2

        kacky.get(randomN).kill();
        kacky.remove(randomN);
    }
    public void printKacky(){
        for (Kacka k: kacky){
            k.kackaInfo();
        }
    }
    public void init(){
        players.add(new Player("Simon"));
        players.add(new Player("Matej"));
        for(Player p: players){
            kacky.add(p.addKacka());
            kacky.add(p.addKacka());
            kacky.add(p.addKacka());
            kacky.add(p.addKacka());
            kacky.add(p.addKacka());
        }
    }
}
