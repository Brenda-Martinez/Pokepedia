package model.pokedex;

public class Measure {

    // ----- ATRIBUTOS -----

    private final float height;
    private final float weight;
    private final boolean legendary;

    // ----- CONSTRUTOR -----

    public Measure(){
        this.height = 0.4f;
        this.weight = 6.0f;
        this.legendary = false;
    }

    // ----- GETTERS -----

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isLegendary() {
        return legendary;
    }
}
