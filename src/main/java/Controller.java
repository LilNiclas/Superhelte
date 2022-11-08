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



}
