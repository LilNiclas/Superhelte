import java.util.ArrayList;

public class Database {

    ArrayList<Superhero> helteDatabase = new ArrayList<>();

    private Superhero superhero = new Superhero();

    public void createSuperhero(String navn, String superkraft, char menneske, int introår, double styrkepoint) {

        Superhero hero = new Superhero(navn, superkraft, menneske, introår, styrkepoint);
        helteDatabase.add(hero);
    }

    public ArrayList<Superhero> getHelteDatabase(){
        return getHelteDatabase();
    }
}




