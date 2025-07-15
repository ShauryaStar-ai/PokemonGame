package PlayingGame;

import Abstraction.PokemonBase;
import Abstraction.PokemonForPlayer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
    public void catchPokemon(PokemonBase p){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNum = random.nextInt(3);
        if (randomNum == 1){
        pokemonCollection.add( p);
            System.out.println("You caught " +p);
            System.out.println("Name him" );
            name = scanner.next();
            p.setName(name);
        }
        else{
            System.out.println("The Pokemon "+p+" escaped ");
        }

    }
}
