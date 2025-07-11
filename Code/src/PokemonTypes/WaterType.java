package PokemonTypes;

import Abstraction.PokemonBase;
import Abstraction.PokemonForPlayer;

public class WaterType extends PokemonBase {
    public WaterType(String name, int level){
        super(name,level,"Water");
    }
    @Override
    public String Generalattack(PokemonBase pokemonAttacked) {
        double damage = 20;
        String attack = "Hydro Pump attack !! CAUSED DAMAGE "+ damage;
        pokemonAttacked.setHealthAfterAttack(damage);
        return attack;
        }
}
