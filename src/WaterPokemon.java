import java.util.List;

public class WaterPokemon extends Pokemon {

    private final String type = "Water";

// De gekozen aantallen hp's zijn random, want ik heb verder geen kennis van Pokemon, maar het leek me leuk (en logisch) dat verschillende soorten aanvallen verschillen in de schade die ze aanrichten.

    void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "firePokemon": {
                System.out.println(enemy.getName() + "loses 15hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + "loses 10hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + "loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + "loses 3hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "firePokemon": {
                System.out.println(enemy.getName() + "loses 20hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + "loses 15hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + "loses 12hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + "loses 5hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "firePokemon": {
                System.out.println(enemy.getName() + "loses 22hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + "loses 15hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + "loses 8hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "waterPokemon": {
                System.out.println(enemy.getName() + "loses 5hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

    void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "firePokemon": {
                System.out.println(enemy.getName() + "loses 12hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + "loses 8hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + "loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "waterPokemon": {
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