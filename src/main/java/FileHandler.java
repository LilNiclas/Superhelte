import Superhero.Superhero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {


    public void saveData(ArrayList<Superhero> superheroes) throws FileNotFoundException {

        PrintStream output = new PrintStream(new File("data/superheroes.csv"));

        for (Superhero hero : superheroes) {
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

        output.flush();
        output.close();
    }

    public ArrayList<Superhero> loadData() throws FileNotFoundException {
        Scanner reader = new Scanner(new File("data/superheroes.csv"));

        ArrayList<Superhero> superheroes = new ArrayList<>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);

            Superhero superheroObject = csvLine(line);

            superheroes.add(superheroObject);
        }
        return superheroes;
    }

    private Superhero csvLine(String line) {
        String[] parts = line.split(";");

        Superhero infoSuper = new Superhero();
        infoSuper.setName(parts[0]);
        infoSuper.setSuperpower(parts[1]);
        boolean menneske = Boolean.parseBoolean(parts[2]);
        infoSuper.setHuman(menneske);
        int årstal = Integer.parseInt(parts[3]);
        infoSuper.setIntroYear(årstal);
        double strenghtPoints = Double.parseDouble(parts[4]);
        infoSuper.setStrengthPoint(strenghtPoints);

        return infoSuper;
    }
    /*public void loadData(ArrayList<Superhero.Superhero> superheroes) throws FileNotFoundException {
        superheroes.clear();

        Scanner scan = new Scanner(new File("data/superheroes.csv"));

        Superhero.Superhero superhero = null;
        while (!superhero. && scan.hasNextLine()) {
            superheroes = scan.nextLine();
            if (!superhero.isBlank()) {
                superheroes.add(superhero);
            }
    }
        */
}

