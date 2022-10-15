package model.pokedex.pokedata;

public class Lineage {

    // ----- ATRIBUTOS -----

    private final String firstborn;
    private final int quantity;
    private final int phase;

    // ----- CONSTRUTOR -----

    public Lineage(){
        this.firstborn = "Pichu";
        this.quantity = 3;
        this.phase = 2;
    }

    // ----- GETTERS -----

    public String getFirstborn() {
        return firstborn;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPhase() {
        return phase;
    }
}
