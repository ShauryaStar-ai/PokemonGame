package Pokemon;

import Abstraction.PokemonBase;
import PokemonTypes.GrassType;

public class Bulbasaur extends GrassType {
    public Bulbasaur (String name, int level){
        super(name, level);
    }

    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        return getName()+" executed " + super.Generalattack(pokemonAttacked);
    }


    public String leafAttack(PokemonBase pokemonAttacked) {
        double damage = 15;
        pokemonAttacked.updateHealthAfterAttack(damage);
        return getName() + " uses Leaf Attack! and caused damage of " + damage+ " health";
    }

    @Override
    public String toString() {
        return "Bulbasaur Named " + getName();
    }
}
