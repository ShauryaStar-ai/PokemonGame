package Pokemon;

import PokemonTypes.WaterType;


public class Squirtle extends WaterType {
    public Squirtle(String name, int level){
        super( name, level);
    }

    @Override
    public String attack(){
        return getName()+super.attack();
    }
    public String shell(){
        return " shell Attack is happeing";
    }
    @Override
    public String toString() {
        return "Squirtle Named " + getName();
    }
}

