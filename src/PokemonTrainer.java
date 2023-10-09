import java.util.List;

public class PokemonTrainer {

    private final String name;

    private List<Pokemon> Pokemons;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        Pokemons = pokemons;
    }

    public String getName() {
        return name;
    }
    public List<Pokemon> getPokemons() {
        return Pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        Pokemons = pokemons;
    }
}
