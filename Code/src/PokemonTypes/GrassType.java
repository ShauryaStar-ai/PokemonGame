package PokemonTypes;

import Abstraction.PokemonBase;

public class GrassType extends PokemonBase {
    public GrassType(String name, int level) {
        super(name, level, "Grass");
    }


    @Override
    public String Generalattack(PokemonBase pokemonAttacked){
        double damage = 30;
        pokemonAttacked.giveDamageAfterAttack(damage);
        return "Solar Beam attack !! CAUSED DAMAGE "+ damage+ " of health points on "+pokemonAttacked;
    }
}
