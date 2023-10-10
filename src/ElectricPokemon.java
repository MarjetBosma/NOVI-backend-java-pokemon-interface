import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "Electric"; // static maakt dat het type al bestaat voordat de pokemon wordt aangemaakt, final maakt dat het niet meer veranderd kan worden

    private static final List<String> attacks = Arrays.asList("thunderpunch", "thunder", "electroball", "volttackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    // De gekozen aantallen hp's zijn random, want ik heb verder geen kennis van Pokemon, maar het leek me leuk (en logisch) dat verschillende soorten aanvallen verschillen in de schade die ze aanrichten.

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch.");
        switch (enemy.getType()) { // getName en getType omdat deze variabelen private zijn in superclass

            case "waterPokemon": {
                System.out.println(enemy.getName() + " loses 15hp.");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grassPokemon": {
                System.out.println(enemy.getName() + " loses 10hp.");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "firePokemon": {
                System.out.println(enemy.getName() + " loses 5hp.");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "electricPokemon": {
                System.out.println(enemy.getName() + " loses 3hp.");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
    }

        void electroBall(Pokemon name, Pokemon enemy){
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with electro ball.");
            switch (enemy.getType()) {

                case "waterPokemon": {
                    System.out.println(enemy.getName() + " loses 20hp.");
                    enemy.setHp(enemy.getHp() - 20);
                }
                case "grassPokemon": {
                    System.out.println(enemy.getName() + " loses 15hp.");
                    enemy.setHp(enemy.getHp() - 15);
                }
                case "firePokemon": {
                    System.out.println(enemy.getName() + " loses 12hp.");
                    enemy.setHp(enemy.getHp() - 12);
                }
                case "electricPokemon": {
                    System.out.println(enemy.getName() + " loses 5hp.");
                    enemy.setHp(enemy.getHp() - 5);
                }
            }
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
        }

        void thunder(Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder.");
            switch (enemy.getType()) {

                case "waterPokemon": {
                    System.out.println(enemy.getName() + " loses 22hp.");
                    enemy.setHp(enemy.getHp() - 22);
                }
                case "grassPokemon": {
                    System.out.println(enemy.getName() + " loses 15hp.");
                    enemy.setHp(enemy.getHp() - 15);
                }
                case "firePokemon": {
                    System.out.println(enemy.getName() + " loses 8hp.");
                    enemy.setHp(enemy.getHp() - 8);
                }
                case "electricPokemon": { // Ik ben ervan uitgegaan dat beide Electric Pokemons extra hp's krijgen, zowel de aanvaller als de verdediger
                    System.out.println(enemy.getName() + " gains 10hp.");
                    System.out.println(name.getName() + " gains 10hp");
                    enemy.setHp(enemy.getHp() + 10);
                    name.setHp(name.getHp() + 10);
                }
            }
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " health points left.");
        }

        void voltTackle(Pokemon name, Pokemon enemy){
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with volt tackle.");
            switch (enemy.getType()) {

                case "waterPokemon": {
                    System.out.println(enemy.getName() + " loses 12hp.");
                    enemy.setHp(enemy.getHp() - 12);
                }
                case "grassPokemon": {
                    System.out.println(enemy.getName() + " loses 8hp.");
                    enemy.setHp(enemy.getHp() - 8);
                }
                case "firePokemon": {
                    System.out.println(enemy.getName() + " loses 5hp.");
                    enemy.setHp(enemy.getHp() - 5);
                }
                case "electricPokemon": {
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
