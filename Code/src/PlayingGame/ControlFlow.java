package PlayingGame;

import Abstraction.PokemonBase;
import Abstraction.PokemonForPlayer;
import Pokemon.*;
import PokemonTypes.FireType;

public class ControlFlow {
    public static void main(String[] args) {
        Player ash  = new Player("Ash",10);
        RandomPokemonGenerator generator = new RandomPokemonGenerator();
        generator.start();
        ash.catchPokemon(wildPokemon);

    }
}