package Pokemon;

import Abstraction.PokemonBase;
import PokemonTypes.FireType;

public class Charlizard extends FireType {
    public Charlizard (String name, int level){
        super(name, level);
    }

    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        return getName()+" exectued "+super.Generalattack(pokemonAttacked);
    }
    public String tossAttack(PokemonBase pokemonAttacked){
        double damage = 50;
        pokemonAttacked.updateHealthAfterAttack(damage);
        return getName() + "did iron toss attack and caused damage of " + damage+ " health points on "+pokemonAttacked;
    }
    @Override
    public String toString() {
        return "Charlizard Named " + getName();
    }
}
