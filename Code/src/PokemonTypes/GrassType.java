package PokemonTypes;

import Abstraction.PokemonBase;

public class GrassType extends PokemonBase {
    public GrassType(String name, int level) {
        super(name, level, "Grass");
    }

    @Override
    public String attack() {
        return getName() + " uses Solar Beam!";
    }
}
