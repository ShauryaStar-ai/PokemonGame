package Pokemon;

import Abstraction.PokemonBase;
import PokemonTypes.GrassType;

public class Bulbasaur extends GrassType {
    public Bulbasaur (String name, int level){
        super(name, level);
    }

    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        return getName() + " uses Vine Whip!";
    }

    public String leafAttack() {
        return getName() + " uses Leaf Attack!";
    }

    @Override
    public String toString() {
        return "Bulbasaur Named " + getName();
    }
}
