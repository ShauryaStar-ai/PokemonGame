package Pokemon;

import PokemonTypes.FireType;

public class Charlizard extends FireType {
    private int level;

    public int getLevel() {
        return level;
    }

    public int setLevel(int level) {
        if (level < 0){
            System.out.println( "Ivalid level");
        }
        else
            this.level = level;
        return level;
    }

    @Override
    public String attack() {
        return "Charlizard: "+ super.attack();
    }
    public String tossAttack(){
        return "Iron toss Attack is happeing";
    }
}
