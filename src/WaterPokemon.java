import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "Water";

    private static final List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }
// De gekozen aantallen hp's zijn random, want ik heb verder geen kennis van Pokemon, maar het leek me leuk (en logisch) dat verschillende soorten aanvallen verschillen in de schade die ze aanrichten.

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "firePokemon": {
                System.out.println(enemy.getName() + " loses 15hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + " loses 10hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + " loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + " loses 3hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydropump.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "firePokemon": {
                System.out.println(enemy.getName() + " loses 20hp.");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + " loses 15hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + " loses 12hp.");
                enemy.setHp(enemy.getHp() - 12);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + " loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydrocanon.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "firePokemon": {
                System.out.println(enemy.getName() + " loses 22hp.");
                enemy.setHp(enemy.getHp() - 22);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + " loses 15hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + " loses 8hp.");
                enemy.setHp(enemy.getHp() - 8);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + " loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rain dance.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "firePokemon": {
                System.out.println(enemy.getName() + " loses 12hp.");
                enemy.setHp(enemy.getHp() - 12);
            }
            case "electricPokemon": {
                System.out.println("has no effect on " + enemy.getName());
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + " gains 8hp.");
                enemy.setHp(enemy.getHp() + 8);
            }
            case "waterPokemon": {
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