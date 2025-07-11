package Pokemon;

import Abstraction.PokemonBase;
import PokemonTypes.WaterType;


public class Squirtle extends WaterType {
    public Squirtle(String name, int level) {
        super(name, level);
    }

    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        return getName()+" executed " + super.Generalattack(pokemonAttacked);
    }

    public String shell(PokemonBase pokemonAttacked) {
        double damage = 20;
        pokemonAttacked.updateHealthAfterAttack(damage);
        return getName() + "did shell attack and caused damage of " + damage+ " health";
    }
        @Override
        public String toString () {
            return "Squirtle Named " + getName();
        }
    }


