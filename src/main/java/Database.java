import Comparator.*;
import Superhero.Superhero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Database {


    private ArrayList<Superhero> heroDatabase = new ArrayList<>();

    Superhero superhero = new Superhero();

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
            if (hero.getName().toLowerCase().contains(searchTerm.toLowerCase().trim())) {
                searchResult.add(hero);
            }
        }
        return searchResult;
    }


    public boolean deleteSuperhero(Superhero superhero) {
        boolean succes = heroDatabase.remove(superhero);
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

    public void sortDataByName () {
        Collections.sort(heroDatabase, new NameComparator());
        System.out.println("\n" + "Heroes sorted by name: " + heroDatabase);
    }

    public void sortIntroYear() {
        Collections.sort(heroDatabase, new IntroYearComparator());
        System.out.println("\n" + "Heroes sorted by introyear: " + heroDatabase);
    }

    public void sortStrengthPoints(){
        Collections.sort(heroDatabase, new StrengthpointComparator());
        System.out.println("\n" + "Heroes sorted by strength: " + heroDatabase);
    }

    public void sortSuperPowers(){
        Collections.sort(heroDatabase, new SuperpowerComparator());
        System.out.println("\n" + "Heroes sorted by superheroes: " + heroDatabase);
    }

    public void sortHuman(){
        Collections.sort(heroDatabase, new HumanComparator());
        System.out.println("\n" + "Heroes sorted by humanstatus: " + heroDatabase);
    }

    public void sortDataByNameAndStrengthPoints () {
        Collections.sort(heroDatabase, new NameComparator().thenComparing(new StrengthpointComparator().reversed()));
        System.out.println("\n" + "Heroes sorted by name and secondary by strengthpoints: " + heroDatabase);
    }

    public void sortDataByIntroyearAndStrengthPoints () {
        Collections.sort(heroDatabase, new IntroYearComparator().thenComparing(new StrengthpointComparator().reversed()));
        System.out.println("\n" + "Heroes sorted by introyear and secondary by strengthpoints: " + heroDatabase);
    }

    public void sortDataBySuperpowersAndStrengthPoints () {
        Collections.sort(heroDatabase, new SuperpowerComparator().thenComparing(new StrengthpointComparator().reversed()));
        System.out.println("\n" + "Heroes sorted by superpowers and secondary by strengthpoints: " + heroDatabase);
    }

    public void sortDataByHumanAndStrengthPoints () {
        Collections.sort(heroDatabase, new HumanComparator().thenComparing(new StrengthpointComparator().reversed()));
        System.out.println("\n" + "Heroes sorted by humanstatus and secondary by strengthpoints: " + heroDatabase);
    }

    public void sortBy (String sortBy) {
        Comparator comparator = new FlexibleComparator(sortBy);
        heroDatabase.sort(comparator);
    }

}
