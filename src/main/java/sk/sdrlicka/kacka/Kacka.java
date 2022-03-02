package sk.sdrlicka.kacka;

import sk.sdrlicka.player.Player;

public class Kacka {
    private Player owner;
    public static int poradie=1;
    private int id;

    public Kacka(Player owner) {
        this.owner = owner;
        id =poradie++;
    }
    public String getOwnerName(){
        return owner.getName();
    }

    public void kackaInfo(){
        System.out.println("Kacka "+id + " ma majitela: " +owner.getName());
    }
    public void kill(){
        System.out.println(String.format("Hracovi %s si zabil kacku s indexom %d", this.owner.getName(), this.id));
        owner.decrementKacky();
    }
}
