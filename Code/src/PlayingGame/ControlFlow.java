package PlayingGame;

import Abstraction.PokemonBase;
import Abstraction.PokemonForPlayer;
import Pokemon.*;
import PokemonTypes.FireType;

public class ControlFlow {
    public static void main(String[] args) {
        Bulbasaur bulbasaur = new Bulbasaur("roy",10);
        Squirtle squirtle = new Squirtle("Blake",100);
        System.out.println(squirtle.getHealth());
        System.out.println(bulbasaur.leafAttack(squirtle));
        System.out.println(squirtle.getHealth());



    }
}