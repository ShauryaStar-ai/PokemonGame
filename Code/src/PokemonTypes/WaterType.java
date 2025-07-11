package PokemonTypes;

import Abstraction.PokemonBase;

public class WaterType extends PokemonBase {
    public WaterType(String name, int level){
        super(name,level,"Water");
    }
    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        double damage = 20;
        pokemonAttacked.updateHealthAfterAttack(damage);
        return "Hydro Pump attack !! CAUSED DAMAGE of "+ damage+ " of health points on "+pokemonAttacked ;
        }
}
