import Superhero.Superhero;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Controller {
    private Database database = new Database();
    FileHandler fileHandler = new FileHandler();


    public void createSuperhero(String name, String superpower, boolean human, int introYear, double strengthPoint) {
        database.createSuperhero(name, superpower, human, introYear, strengthPoint);
    }

    public ArrayList<Superhero> getHeroDatabase() {
        return database.getHeroDatabase();
    }

    public ArrayList<Superhero> searchSuperhero(String searchTerm) {
        return database.searchSuperhero(searchTerm);
    }

    public boolean deleteSuperhero(Superhero superhero) {
        return database.deleteSuperhero(superhero);
    }


    public void saveData() {
        try {
            fileHandler.saveData(database.getHeroDatabase());
        } catch (FileNotFoundException e) {
        }
    }

    public void loadData() {
        try {
            ArrayList<Superhero> superheroes = fileHandler.loadData();
            database.addAll(superheroes);
        } catch (FileNotFoundException e) {
        }
    }

    public void getSortedDataByName() {
        database.sortDataByName();

    }
    public void getSortedDataByIntroYear(){
        database.sortIntroYear();
    }
    public void getSortedDataByStrengthPoint(){
        database.sortStrengthPoints();
    }

    public void getSortedDataBySuperpowers(){
        database.sortSuperPowers();
    }

    public void getSortedDataByHuman(){
        database.sortHuman();
    }

    public void createTestData() {
        database.createTestData();
    }

    public void getSortedDataByNameAndStrengthPoints(){
        database.sortDataByNameAndStrengthPoints();
    }

    public void getSortedDataByIntroYearAndStrengthPoints(){
        database.sortDataByIntroyearAndStrengthPoints();
    }
    public void getSortedDataBySuperPowersAndStrengthPoints(){
        database.sortDataBySuperpowersAndStrengthPoints();
    }
    public void getSortedDataByHumanAndStrengthPoints(){
        database.sortDataByHumanAndStrengthPoints();
    }



}
