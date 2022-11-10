
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

    public void sortBy (int sortBy) {
        Comparator comparator = new FlexibleComparator(sortBy);
        heroDatabase.sort(comparator);
    }

    //StrengthPoints secondary
    public void sortDataByNameAndStrengthPoints () {
        Collections.sort(heroDatabase, new NameComparator().thenComparing(new StrengthpointComparator().reversed()));
    }
    public void sortDataByIntroyearAndStrengthPoints () {
        Collections.sort(heroDatabase, new IntroYearComparator().thenComparing(new StrengthpointComparator().reversed()));
    }
    public void sortDataBySuperpowersAndStrengthPoints () {
        Collections.sort(heroDatabase, new SuperpowerComparator().thenComparing(new StrengthpointComparator().reversed()));
    }
    public void sortDataByHumanAndStrengthPoints () {
        Collections.sort(heroDatabase, new HumanComparator().thenComparing(new StrengthpointComparator().reversed()));
    }

    // Superpowers secondary
    public void sortDataByNameAndSuperPowers (){
        Collections.sort(heroDatabase, new NameComparator().thenComparing(new SuperpowerComparator().reversed()) );
    }
    public void sortDataByIntroyearAndSuperPowers (){
        Collections.sort(heroDatabase, new IntroYearComparator().thenComparing(new SuperpowerComparator().reversed()) );
    }
    public void sortDataByHumanAndSuperPowers (){
        Collections.sort(heroDatabase, new HumanComparator().thenComparing(new SuperpowerComparator().reversed()) );
    }
    public void sortDataByStrengthPointsAndSuperpowers (){
        Collections.sort(heroDatabase, new StrengthpointComparator().thenComparing(new SuperpowerComparator().reversed()) );
    }

    //Introyear secondary
    public void sortDataByNameAndIntroyear (){
        Collections.sort(heroDatabase, new NameComparator().thenComparing(new IntroYearComparator().reversed()) );
    }
    public void sortDataBySuperpowersAndIntroyear (){
        Collections.sort(heroDatabase, new SuperpowerComparator().thenComparing(new IntroYearComparator().reversed()) );
    }
    public void sortDataByHumanAndIntroyear (){
        Collections.sort(heroDatabase, new HumanComparator().thenComparing(new IntroYearComparator().reversed()) );
    }
    public void sortDataByStrengthPointsAndIntroyear (){
        Collections.sort(heroDatabase, new StrengthpointComparator().thenComparing(new IntroYearComparator().reversed()) );
    }

    //Human som secondary
    public void sortDataByIntroyearAndHuman (){
        Collections.sort(heroDatabase, new IntroYearComparator().thenComparing(new HumanComparator().reversed()) );
    }
    public void sortDataByNameAndHuman (){
        Collections.sort(heroDatabase, new NameComparator().thenComparing(new HumanComparator().reversed()) );
    }
    public void sortDataByStrengthPointsAndHuman (){
        Collections.sort(heroDatabase, new StrengthpointComparator().thenComparing(new HumanComparator().reversed()) );
    }
    public void sortDataBySuperpowersAndHuman (){
        Collections.sort(heroDatabase, new SuperpowerComparator().thenComparing(new HumanComparator().reversed()) );
    }

    //Name som secondary
    public void sortDataByIntroyearAndName (){
        Collections.sort(heroDatabase, new IntroYearComparator().thenComparing(new NameComparator().reversed()) );
    }
    public void sortDataByStrengthPointsAndName (){
        Collections.sort(heroDatabase, new StrengthpointComparator().thenComparing(new NameComparator().reversed()) );
    }
    public void sortDataBySuperpowersAndName (){
        Collections.sort(heroDatabase, new SuperpowerComparator().thenComparing(new NameComparator().reversed()) );
    }
    public void sortDataByHumanAndName (){
        Collections.sort(heroDatabase, new HumanComparator().thenComparing(new NameComparator().reversed()) );
    }
}
