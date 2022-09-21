import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    private Database database;

    @BeforeEach
    void prepareTest() {
        database = new Database();
    }

    @Test
    public void createSuperhero() {
        //Arrange
        int expected = 2;

        //Act
        database.createSuperhero("Spiderman", "spider sense", true, 1945, 15);
        database.createSuperhero("Batman", "Money", true, 1978, 12);

        ArrayList<Superhero> result = database.getHeroDatabase();
        int actual = result.size();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void searchMultipleSuperhero() {
        //Arrange
        int expected = 3;
        String search = "man";

        //Act
        database.createSuperhero("Spiderman", "Spider sense", true, 1945, 15);
        database.createSuperhero("Batman", "Money", true, 1978, 12);
        database.createSuperhero("Superman", "Laser", false, 1938, 50);

        ArrayList<Superhero> searchResult = database.searchSuperhero(search);
        int actual = searchResult.size();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void searchZeroSuperhero() {
        //Arrange
        int expected = 0;
        String search = "Black Panther";

        //Act
        database.createSuperhero("Spiderman", "Spider sense", true, 1945, 15);
        database.createSuperhero("Batman", "Money", true, 1978, 12);
        database.createSuperhero("Superman", "Laser", false, 1938, 50);

        ArrayList<Superhero> searchResult = database.searchSuperhero(search);
        int actual = searchResult.size();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void searchForCase() {

        database.createSuperhero("Superman", "Laser", false, 1938, 50);
        ArrayList<Superhero> searchResult = database.searchSuperhero("sUperMan");

        int actual = searchResult.size();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void deleteSuperhero(){

        database.createSuperhero("Spiderman", "Spider sense", true, 1945, 15);
        database.createSuperhero("Batman", "Money", true, 1978, 12);
        database.createSuperhero("Superman", "Laser", false, 1938, 50);
        ArrayList<Superhero> searchResult = database.getHeroDatabase();
        Superhero superhero = searchResult.get(0);
        int expectedSize = searchResult.size() - 1;

        boolean actualResult = database.deleteSuperhero(superhero);
        boolean expectedResult = true;

        assertEquals(expectedResult ,actualResult);

        ArrayList<Superhero> resultAfterDelete = database.getHeroDatabase();
        int actualSize = resultAfterDelete.size();

        assertEquals(expectedSize, actualSize);
    }

}