import Superhero.Superhero;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Controller {
    private Database database;
    private FileHandler fileHandler;


    public Controller() {
        this.database = new Database();
        this.fileHandler = new FileHandler();
        fileHandler.setDatabase(database);
    }

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

    public void setChangesMade(boolean changesMade) {
        database.setChangesMade(true);
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

 */

    public void createTestData() {
        database.createTestData();
    }

    public void getSortedDataByNameAndStrengthPoints(){
        database.sortDataByNameAndStrengthPoints();
    }

    // Secondary strengthpoints
    public void getSortedDataByIntroYearAndStrengthPoints() {
        database.sortDataByIntroyearAndStrengthPoints();
    }
    public void getSortedDataBySuperPowersAndStrengthPoints(){
        database.sortDataBySuperpowersAndStrengthPoints();
    }
    public void getSortedDataByHumanAndStrengthPoints(){
        database.sortDataByHumanAndStrengthPoints();
    }

    // Secondary Superpowers
    public void getSortedDatabyNameAndSuperPowers() {
        database.sortDataByNameAndSuperPowers();
    }

    public void getSortedDataByIntroyearAndSuperPowers() {
        database.sortDataByIntroyearAndSuperPowers();
    }

    public void getSortedDataByHumanAndSuperPowers() {
        database.sortDataByHumanAndSuperPowers();
    }

    public void getSortedDataByStrengthPointsAndSuperpowers() {
        database.sortDataByStrengthPointsAndSuperpowers();
    }

    // Secondary Introyear
    public void getSortedDataByNameAndIntroyear() {
        database.sortDataByNameAndIntroyear();
    }

    public void getSortedDataBySuperpowersAndIntroyear() {
        database.sortDataBySuperpowersAndIntroyear();
    }

    public void getSortedDataByHumanAndIntroyear() {
        database.sortDataByHumanAndIntroyear();
    }

    public void getSortedDataByStrengthPointsAndIntroyear() {
        database.sortDataByStrengthPointsAndIntroyear();
    }


    // Secondary Human
    public void getSortedDataByIntroyearAndHuman() {
        database.sortDataByIntroyearAndHuman();
    }

    public void getSortedDataByNameAndHuman() {
        database.sortDataByNameAndHuman();
    }

    public void getSortedDataByStrengthPointsAndHuman() {
        database.sortDataByStrengthPointsAndHuman();
    }

    public void getSortedDataBySuperpowersAndHuman() {
        database.sortDataBySuperpowersAndHuman();
    }


    // Secondary Name
    public void getSortedDataByIntroyearAndName() {
        database.sortDataByIntroyearAndName();
    }

    public void getSortedDataByStrengthPointsAndName() {
        database.sortDataByStrengthPointsAndName();
    }

    public void getSortedDataBySuperpowersAndName() {
        database.sortDataBySuperpowersAndName();
    }

    public void getSortedDataByHumanAndName () {
        database.sortDataByHumanAndName();
    }
}


}
