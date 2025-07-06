package PlayingGame;

import Interfaces.PokemonForPlayer;

import java.util.ArrayList;

public class Player {
    private String name;
    private int numPokemon;
    ArrayList<PokemonForPlayer> pokemonCollection;

    public Player(String name,int numPokemon){
        this.name = name;
        this.numPokemon = numPokemon;
        this.pokemonCollection =   new ArrayList<>();
    }
    public String addPokemon(PokemonForPlayer p ){
        pokemonCollection.add(p);
        return "Pokemon "+p+" added";
    }

    // write function to show and add pokemon
}
