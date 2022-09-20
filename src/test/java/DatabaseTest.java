import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {

    Database database = new Database();

    @org.junit.jupiter.api.Test
    public void createSuperhero() {
        //Arrange
        int expected = 1;
        //Act
        database.createSuperhero("Spiderman", "spider sense", true, 1945, 15);
        //Assert
        int actual = database.getHeroDatabase().size();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void searchSuperhero() {
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

}