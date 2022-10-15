package model.pokedex.pokedata;

public class Type {

    // ----- ATRIBUTOS -----

    private final String type1;
    private final String type2;
    private final String[] strength;
    private final String[] weakness;
    private final String[] immunity;

    // ----- CONSTRUTOR -----

    public Type(){
        this.type1 = "Electric";
        this.type2 = null;
        this.strength = new String[] {"Water", "Fly"};
        this.weakness = new String[] {"Electric", "Grass", "Dragon"};
        this.immunity = null;
    }

    // ----- GETTERS -----

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public String[] getStrength() {
        return strength;
    }

    public String[] getWeakness() {
        return weakness;
    }

    public String[] getImmunity() {
        return immunity;
    }
}
