package Pokemon;

import PokemonTypes.FireType;

public class Charlizard extends FireType {
    public Charlizard (String name, int level){
        super(name, level);
    }

    @Override
    public String attack() {
        return getName()+ super.attack();
    }
    public String tossAttack(){
        return "Iron toss Attack is happeing";
    }
    @Override
    public String toString() {
        return "Charlizard Named " + getName();
    }
}
