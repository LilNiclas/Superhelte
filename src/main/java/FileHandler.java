import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public void saveData(ArrayList<Superhero> superheroes) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("data/superheroes.csv"));

        for(Superhero hero : superheroes) {
            output.print(hero.getName());
            output.print(";");
            output.print(hero.getSuperpower());
            output.print(";");
            output.print(hero.isHuman());
            output.print(";");
            output.print(hero.getIntroYear());
            output.print(";");
            output.print(hero.getStrengthPoint());
            output.println();
        }
        output.close();
    }
}
