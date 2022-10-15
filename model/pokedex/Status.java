package model.pokedex;

public class Status {

    // ----- ATRIBUTOS -----

    private final int hp;
    private final int attack;
    private final int defense;
    private final int spAttack;
    private final int spDefense;
    private final int speed;

    // ----- CONSTRUTOR -----

    public Status(){
        this.hp = 35;
        this.attack = 55;
        this.defense = 30;
        this.spAttack = 50;
        this.spDefense = 50;
        this.speed = 90;
    }

    // ----- GETTERS -----

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public int getSpDefense() {
        return spDefense;
    }

    public int getSpeed() {
        return speed;
    }
}