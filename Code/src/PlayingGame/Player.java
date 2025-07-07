package PlayingGame;

import Abstraction.PokemonForPlayer;

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
    public void addPokemon(PokemonForPlayer p ){
        pokemonCollection.add(p);
        System.out.println("Pokemon "+p+" added");
    }
    public void showPokemon(){
        for (PokemonForPlayer p  :pokemonCollection){
            System.out.println(this.name+" has pokeomn "+p);
        }
    }
}
