package Pokemon;

import Abstraction.PokemonBase;
import PokemonTypes.FireType;

public class Charlizard extends FireType {
    public Charlizard (String name, int level){
        super(name, level);
    }

    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        return getName()+ " amber attack ";
    }
    public String tossAttack(){
        return "Iron toss Attack is happeing";
    }
    @Override
    public String toString() {
        return "Charlizard Named " + getName();
    }
}
