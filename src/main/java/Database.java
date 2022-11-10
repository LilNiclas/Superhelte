
import Comparator.*;
import Superhero.Superhero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Database {

    private ArrayList<Superhero> heroDatabase = new ArrayList<>();

    private boolean changesMade = false;

    public boolean isChangesMade() {
        return changesMade;
    }

    public void setChangesMade(boolean changesMade) {
        this.changesMade = changesMade;
    }

    public void createSuperhero(String name, String superpower, boolean human, int introYear, double strengthPoint) {

        Superhero hero = new Superhero(name, superpower, human, introYear, strengthPoint);
        heroDatabase.add(hero);
        setChangesMade(true);
    }


    public ArrayList<Superhero> getHeroDatabase() {
        return heroDatabase;
    }


    public ArrayList<Superhero> searchSuperhero(String searchTerm) {

        ArrayList<Superhero> searchResult = new ArrayList<>();

        for (Superhero hero : heroDatabase) {
            if (hero.getName().toLowerCase().contains(searchTerm.toLowerCase().trim())) {
                searchResult.add(hero);
            }
        }
        return searchResult;
    }


    public boolean deleteSuperhero(Superhero superhero) {
        boolean succes = heroDatabase.remove(superhero);
        setChangesMade(true);
        return succes;
    }

    public void addAll(ArrayList<Superhero> superheroes) {
        heroDatabase.addAll(superheroes);
    }

    public void createTestData () {
        createSuperhero("Hans","Flot",false, 2000,2.5);
        createSuperhero("Bob","Svæve",true, 1970,3.0);
        createSuperhero("Bob","Irriterende",true, 2002,1.0);
        createSuperhero("Bob","Random",true, 2010,5.0);
        createSuperhero("Torben","Creepy",false, 1862,1.5);
    }

    public void sortBy (String sortBy) {
        Comparator comparator = new FlexibleComparator(sortBy);
        heroDatabase.sort(comparator);
    }

}
