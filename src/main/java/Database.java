import java.util.ArrayList;

public class Database {

    ArrayList<Superhero> helteDatabase = new ArrayList<>();

    private Superhero superhero = new Superhero();

    public void createSuperhero(String navn, String superkraft, boolean menneskeForm, int introår, double styrkepoint) {

        Superhero hero = new Superhero(navn, superkraft, menneskeForm, introår, styrkepoint);
        helteDatabase.add(hero);
    }
}




