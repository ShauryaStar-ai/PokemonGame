package PlayingGame;

import Pokemon.*;

public class ControlFlow {
    public static void main(String[] args) {
        Bulbasaur bulb = new Bulbasaur("ashBulb",10);
        Squirtle squirtle = new Squirtle("ashSqurile",2);
        Charlizard charlizard = new Charlizard("ashChar",100);
        Player player = new Player("Ash",10);

        charlizard.tossAttack();


    }
}