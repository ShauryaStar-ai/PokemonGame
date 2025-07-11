package Abstraction;

public abstract class PokemonBase implements PokemonForPlayer {
    private String name;
    private int level;
    private String type;
    private double health = 100 ;


    public PokemonBase(String name, int level, String type ) {
        this.name = name;
        this.level = level;
        this.type = type;
    }

    // Getters
    public String getName() { return name; }
    public int getLevel() { return level; }
    public String getType() { return type; }
    public double getHealth(){return health; }
    // Setters
    public void setName(String name) { this.name = name; }
    public void setLevel(int level) {
        if (level < 0) {
            throw new IllegalArgumentException("Level must be >= 0");
        }
        this.level = level;
    }
    public void updateHealthAfterAttack(double damage){
        health = health - damage;
    }



}
