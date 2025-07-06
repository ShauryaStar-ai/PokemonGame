package PokemonTypes;

import Abstraction.PokemonBase;

public class WaterType extends PokemonBase {
    public WaterType(String name, int level){
        super(name,level,"Water");
    }
    @Override
    public String attack() {
        String attack = "Hydro Pump attack !! is happeing ";
        return attack;
        }
}
