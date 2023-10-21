// Ik heb een poging gedaan voor de bonusopdracht, maar ik draaide mezelf er nogal in vast. Het idee was om ook nog een methode throwFood te maken, die oedsel geeft aan een Pokemon, en healh points oplevert als dit het juiste voedsel is(preferredFood). Ik weet echter niet goed hoe ik dit nu verder moet implementeren en op welke plekken, mijn probeersels zorgden vooral voor veel foutmeldingen... Dus ik heb het uiteindelijk hier bij gelaten. Wel zou ik graag zien hoe dit dan wel had gemoeten, bijvoorbeeld bij de volgende huiswerkklas.

public class Food { // Nieuwe klasse gecreëerd voor bonusopdracht
    private String name;
    private int healingValue;

    public Food(String name, int healingValue) {
        this.name = name;
        this.healingValue = healingValue;
    }

    public String getName() {
        return name;
    }

    public int getHealingValue() {
        return healingValue;
    }
}

