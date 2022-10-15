package model;

import model.pokedex.Pokemon;

public class Main {
    public static void main(String[] args) {

        // Main() não tem acesso a nenhuma classe além de Pokemon

        Pokemon poke = new Pokemon(1, "Pikachu");

        poke.all();

        /* Outros métodos Chamáveis em Main()

         poke.id();
         poke.status();
         poke.type();
         poke.lineage();
         poke.measure();        */
    }
}