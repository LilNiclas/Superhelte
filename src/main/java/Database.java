import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    ArrayList<Superhero> heroDatabase = new ArrayList<>();
    ArrayList<Superhero> searchResult = new ArrayList<>();


    public void createSuperhero(String name, String superpower, boolean human, int introYear, double strengthPoint) {

        Superhero hero = new Superhero(name, superpower, human, introYear, strengthPoint);
        heroDatabase.add(hero);
    }

    public ArrayList<Superhero> getHeroDatabase() {
        return heroDatabase;
    }

    public Superhero searchSuperhero(String searchTerm) {

        for (Superhero hero : heroDatabase) {
            if (hero.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchResult.add(hero);
            }
        }
        if (!searchResult.isEmpty())
            for (Superhero hero : searchResult)
                System.out.println(hero);
        else
            System.out.println("Couldn't find a match: " + "\n" + searchTerm + "\n");
        return null;
    }

    public ArrayList<Superhero> getSearchResult(){
    return searchResult;

    }
}