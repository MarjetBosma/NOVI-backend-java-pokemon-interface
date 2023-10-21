import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "Fire";

    private static final List<String> attacks = Arrays.asList("inferno", "pyroball", "firelash", "flamethrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    // De gekozen aantallen hp's zijn random, want ik heb verder geen kennis van Pokemon, maar het leek me leuk (en logisch) dat verschillende soorten aanvallen verschillen in de schade die ze aanrichten.

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "grassPokemon": {
                System.out.println(enemy.getName() + " loses 15hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + " loses 10hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + " loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "firePokemon": {
                System.out.println(enemy.getName() + " loses 3hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroball.");
        switch (enemy.getType()) {

            case "grassPokemon": {
                System.out.println(enemy.getName() + " loses 20hp.");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + " loses 15hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + " loses 12hp.");
                enemy.setHp(enemy.getHp() - 12);
            }
            case "firePokemon": {
                System.out.println(enemy.getName() + " loses 5hp.");
                enemy.setHp(enemy.getHp() -5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with fire lash.");
        switch (enemy.getType()) {

            case "grassPokemon": {
                System.out.println(enemy.getName() + " loses 22hp.");
                enemy.setHp(enemy.getHp() - 22);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + " loses 15hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + " loses 8hp.");
                enemy.setHp(enemy.getHp() - 8);
            }
            case "firePokemon": {
                System.out.println(enemy.getName() + " loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flame thrower.");
        switch (enemy.getType()) {

            case "grassPokemon": {
                System.out.println(enemy.getName() + " loses 12hp.");
                enemy.setHp(enemy.getHp() - 12);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + " loses 8hp.");
                enemy.setHp(enemy.getHp() - 8);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + " loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "firePokemon": {
                System.out.println(enemy.getName() + " loses 2hp.");
                enemy.setHp(enemy.getHp() - 2);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    public static List<String> getAttacks() {
        return attacks;


    }


}
