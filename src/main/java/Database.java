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

    public Superhero searchSuperhero(String searchTerm) {
        ArrayList<Superhero> søgeResultat = new ArrayList<>();
        for (Superhero hero : helteDatabase) {
            if (hero.getNavn().toLowerCase().contains(searchTerm.toLowerCase())) {
                søgeResultat.add(hero);

                if (!søgeResultat.isEmpty())
                    for (Superhero helt : søgeResultat)
                        System.out.println(helt);
                else
                    System.out.println("Kunne ikke finde noget der matchede til: " + "\n" + searchTerm + "\n");
            }
        }
        return null;
    }

}