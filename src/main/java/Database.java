import java.util.ArrayList;

public class Database {

    ArrayList<Superhero> helteDatabase = new ArrayList<>();

    public void createSuperhero(String navn, String superkraft, boolean menneske, int introår, double styrkepoint) {

        Superhero hero = new Superhero(navn, superkraft, menneske, introår, styrkepoint);
        helteDatabase.add(hero);
    }

    public ArrayList<Superhero> getHelteDatabase() {
        return helteDatabase;
    }

    public Superhero searchFor(String searchTerm) {
        for (Superhero hero : helteDatabase) {
            if (hero.getNavn().toLowerCase().contains(searchTerm.toLowerCase())) {
                return hero;
            }
        }
        return null;
    }

}




