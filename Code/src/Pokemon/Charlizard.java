package Pokemon;

import Abstraction.PokemonBase;
import PokemonTypes.FireType;

public class Charlizard extends FireType {
    public Charlizard (String name, int level){
        super(name, level);
    }

    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        if (pokemonAttacked.getHealth() <= 0){
            return "The pokemon attacked: "+pokemonAttacked+" has no more health thus cannot be attacked";
        }
        return getName()+" exectued "+super.Generalattack(pokemonAttacked);
    }
    public String tossAttack(PokemonBase pokemonAttacked){
        if (pokemonAttacked.getHealth() <= 0){
            return "The pokemon attacked: "+pokemonAttacked+" has no more health thus cannot be attacked";
        }
        double damage = 50;
        pokemonAttacked.giveDamageAfterAttack(damage);
        return getName() + "did iron toss attack and caused damage of " + damage+ " health points on "+pokemonAttacked;
    }
    @Override
    public String toString() {
        return "Charlizard Named " + getName();
    }
}
