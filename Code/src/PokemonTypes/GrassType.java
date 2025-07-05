package PokemonTypes;

import Interfaces.PokemonForPlayer;

public class GrassType implements PokemonForPlayer {
    private String type = "Grass";
    @Override
    public String attack() {
        String attack = "Solar Beam !! is happeing";
        return attack;
    }
    public String getType() {
        return type;
    }
}
