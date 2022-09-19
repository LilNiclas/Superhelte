import java.util.ArrayList;
import java.util.Scanner;

public class Database {


    private ArrayList<Superhero> heroDatabase = new ArrayList<>();


    public void createSuperhero(String name, String superpower, boolean human, int introYear, double strengthPoint) {

        Superhero hero = new Superhero(name, superpower, human, introYear, strengthPoint);
        heroDatabase.add(hero);
    }


    public ArrayList<Superhero> getHeroDatabase() {
        return heroDatabase;
    }


    public ArrayList<Superhero> searchSuperhero(String searchTerm) {

        ArrayList<Superhero> searchResult = new ArrayList<>();

        for (Superhero hero : heroDatabase) {
            if (hero.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchResult.add(hero);
            }
        }
        return searchResult;
    }
}