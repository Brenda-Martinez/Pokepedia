package model.pokedex;

import model.Shower;
import model.pokedex.pokedata.Lineage;
import model.pokedex.pokedata.Measure;
import model.pokedex.pokedata.Status;
import model.pokedex.pokedata.Type;

public class Pokemon implements Shower {

    // ----- ATRIBUTOS -----

    private int id;
    private String name;
    private final Status status = new Status();
    private final Measure measure = new Measure();
    private final Type type = new Type();
    private final Lineage lineage = new Lineage();

    // ----- CONSTRUTOR -----

    public Pokemon(int id, String name){
        setId(id);
        setName(name);

        // Verifica conexão com o Banco de Dados

    }

    // ----- GETTERS E SETTERS -----

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    // ----- MÉTODOS DE INTERFACE -----

    @Override
    public void all() {
        this.id();
        this.status();
        this.measure();
        this.type();
        this.lineage();
    }

    @Override
    public void id() {
        System.out.println("\n-- IDENTIFICATION --" +
                           "\nID: " + getId() +
                           "\nNAME: " + getName());
    }

    @Override
    public void status() {
        System.out.println("\n-- STATUS --" +
                "\nHeartPoints: " + status.getHp() +
                "\nAttack: " + status.getAttack() +
                "\nDefense: " + status.getDefense() +
                "\nSpecialAttack: " + status.getSpAttack() +
                "\nSpecialDefense: " + status.getSpDefense() +
                "\nSpeed: " + status.getSpeed());
    }

    @Override
    public void measure() {
        System.out.println("\n-- MEASURES --" +
                "\nHeight: " + measure.getHeight() +
                "\nWeight: " + measure.getWeight() +
                "\nLegendary: " + measure.isLegendary());
    }

    @Override
    public void type() {
        System.out.println("\n-- TYPE --" +
                "\nPrimaryType: " + type.getType1());
        if (type.getType2() != null) {
            System.out.println("\nSecondaryType: " + type.getType2());
        }

        System.out.print("Strength: ");
        for (String x : type.getStrength()){
            System.out.print(x + "/ ");
        }
        System.out.print("\nWeakness: ");
        for (String y : type.getWeakness()){
            System.out.print(y + "/ ");
        }
        if (type.getImmunity() != null) {
            System.out.println("\nImmunity:");
            for (String z : type.getImmunity()){
                System.out.print(z + "/ ");
            }
        }
        System.out.println();
    }

    @Override
    public void lineage() {
        System.out.println("\n-- LINEAGE --" +
                "\nFirstBorn: " + lineage.getFirstborn() +
                "\nQuantity: " + lineage.getQuantity() +
                "\nPhase: " + lineage.getPhase() + "/" + lineage.getQuantity());
    }
}
