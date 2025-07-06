package PokemonTypes;

import Interfaces.PokemonForPlayer;

public class GrassType implements PokemonForPlayer {
    private String type = "Grass";
    private int level;
    private String name;
    @Override
    public String attack() {
        String attack = "Solar Beam !! is happeing";
        return attack;
    }
    public String getType() {
        return type;
    }
}
