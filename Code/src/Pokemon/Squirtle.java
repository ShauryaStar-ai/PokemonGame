package Pokemon;

import Abstraction.PokemonBase;
import PokemonTypes.WaterType;


public class Squirtle extends WaterType {
    public Squirtle(String name, int level) {
        super(name, level);
    }

    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        if (pokemonAttacked.getHealth() <= 0){
            return "The pokemon attacked: "+pokemonAttacked+" has no more health thus cannot be attacked";
        }
        return getName()+" executed " + super.Generalattack(pokemonAttacked);
    }

    public String shell(PokemonBase pokemonAttacked) {
        if (pokemonAttacked.getHealth() <= 0){
            return "The pokemon attacked: "+pokemonAttacked+" has no more health thus cannot be attacked";
        }
        double damage = 20;
        pokemonAttacked.giveDamageAfterAttack(damage);
        return getName() + "did shell attack and caused damage of " + damage+ " health points on "+pokemonAttacked;
    }
        @Override
        public String toString () {
            return "Squirtle Named " + getName();
        }
    }


