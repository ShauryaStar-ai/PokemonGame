package Pokemon;

import Abstraction.PokemonBase;
import PokemonTypes.WaterType;


public class Squirtle extends WaterType {
    public Squirtle(String name, int level) {
        super(name, level);
    }

    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        return getName() + super.Generalattack(pokemonAttacked);
    }

    public String shell(PokemonBase pokemonAttacked) {
        double damage = 20;
        pokemonAttacked.setHealthAfterAttack(damage);
        return getName() + "did shell attack" + damage;
    }
        @Override
        public String toString () {
            return "Squirtle Named " + getName();
        }
    }


