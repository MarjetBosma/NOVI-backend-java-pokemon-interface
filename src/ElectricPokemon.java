import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "Electric"; // static maakt dat het type al bestaat voordat de pokemon wordt aangemaakt, final maakt dat het niet meer veranderd kan worden

    private static final List<String> attacks = Arrays.asList("thunder", "thunderPunch", "electroBall", "voltTackle") ;

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }
}
