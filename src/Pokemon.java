public abstract class Pokemon { // Abstract, omdat je dan geen pokemon (super class) kunt aanmaken, maar alleen een bepaald type pokemon (subclass)
    private final String name;
    private final String type;
    private final int level;
    private int hp;
    private final String food;
    private final Food preferredFood; // Variabele preferredFood, type Food van de nieuwe klasse Food, voor de bonusopdracht. Het is me helaas niet gelukt dit verder te implementeren.
    private final String sound;

    public Pokemon(String name, String type, int level, int hp, String food, Food preferredFood, String sound) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.preferredFood = preferredFood;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) { // setter is nodig, omdat de waarde kan veranderen
        this.hp = hp;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public Food getPreferredFood() {
        return preferredFood;
    }
}

