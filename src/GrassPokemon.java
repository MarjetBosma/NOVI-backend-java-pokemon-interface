import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final String type = "Grass";

    private static final List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leafblade");

    public grassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

// De gekozen aantallen hp's zijn random, ik heb verder geen kennis van Pokemon. Het leek me leuk (en logisch) dat verschillende soorten aanvallen verschillen in de schade die ze aanrichten.

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "electricPokemon": {
                System.out.println(enemy.getName() + "loses 15hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "firePokemon": {
                System.out.println(enemy.getName() + "loses 10hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + "loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + "loses 3hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void hydropump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "electricPokemon": {
                System.out.println(enemy.getName() + "loses 20hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "firePokemon": {
                System.out.println(enemy.getName() + "loses 15hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + "loses 12hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + "loses 5hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void hydrocanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "electricPokemon": {
                System.out.println(enemy.getName() + "loses 22hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "firePokemon": {
                System.out.println(enemy.getName() + "loses 15hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + "loses 8hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + "loses 5hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "electricPokemon": {
                System.out.println(enemy.getName() + "loses 12hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "firePokemon": {
                System.out.println(enemy.getName() + "loses 8hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + "loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + "loses 2hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }
    public static List<String> getAttacks() {
        return attacks;
    }
}