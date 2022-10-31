import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControllerTest {

    private Controller controller;

    @BeforeEach
    void prepareTest() {
        controller = new Controller();
    }

    @Test
    public void createSuperhero() {
        //Arrange
        int expected = 2;

        //Act
        controller.createSuperhero("Spiderman", "spider sense", true, 1945, 15);
        controller.createSuperhero("Batman", "Money", true, 1978, 12);

        ArrayList<Superhero> result = controller.getHeroDatabase();
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
        controller.createSuperhero("Spiderman", "Spider sense", true, 1945, 15);
        controller.createSuperhero("Batman", "Money", true, 1978, 12);
        controller.createSuperhero("Superman", "Laser", false, 1938, 50);

        ArrayList<Superhero> searchResult = controller.searchSuperhero(search);
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
        controller.createSuperhero("Spiderman", "Spider sense", true, 1945, 15);
        controller.createSuperhero("Batman", "Money", true, 1978, 12);
        controller.createSuperhero("Superman", "Laser", false, 1938, 50);

        ArrayList<Superhero> searchResult = controller.searchSuperhero(search);
        int actual = searchResult.size();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void searchForCase() {

        controller.createSuperhero("Superman", "Laser", false, 1938, 50);
        ArrayList<Superhero> searchResult = controller.searchSuperhero("sUperMan");

        int actual = searchResult.size();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void deleteSuperhero() {

        controller.createSuperhero("Spiderman", "Spider sense", true, 1945, 15);
        controller.createSuperhero("Batman", "Money", true, 1978, 12);
        controller.createSuperhero("Superman", "Laser", false, 1938, 50);
        ArrayList<Superhero> searchResult = controller.getHeroDatabase();
        Superhero superhero = searchResult.get(0);
        int expectedSize = searchResult.size() - 1;

        boolean actualResult = controller.deleteSuperhero(superhero);
        boolean expectedResult = true;

        assertEquals(expectedResult, actualResult);

        ArrayList<Superhero> resultAfterDelete = controller.getHeroDatabase();
        int actualSize = resultAfterDelete.size();

        assertEquals(expectedSize, actualSize);
    }

}