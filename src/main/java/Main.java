import Comparator.*;
import Superhero.Superhero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] arg) {
        UserInterface ui = new UserInterface();
        ui.userStart();

        /*
        int [] tal = {6,3,7,5,9}; 
        Arrays.sort(tal);
        System.out.println(Arrays.toString(tal));
        Superhero s1 = new Superhero("Hans","Flot",false, 2000,2.5);
        Superhero s2 = new Superhero("Bob","Svæve",true, 1970,3.0);
        Superhero s3 = new Superhero("Bob","Irriterende",true, 2002,1.0);
        Superhero s5 = new Superhero("Bob","Random",true, 2010,5.0);
        Superhero s4 = new Superhero("Torben","Creepy",false, 1862,1.5);


        Superhero[] superheroes = {s1,s2,s3,s4};

        Sorteret efter introyear
        Arrays.sort(superheroes, new IntroYearComparator());
        System.out.println("Personliste sorteret efter introyear: " + Arrays.toString(superheroes));

        // Sorteret efter navn
        Arrays.sort(superheroes, new NameComparator());
        System.out.println("Personliste sorteret efter nam: " + Arrays.toString(superheroes));

        // Sorteret efter strengthpoints
        Arrays.sort(superheroes, new StrengthPointComparator());
        System.out.println("Personliste sorteret efter strengthpoints: " + Arrays.toString(superheroes));

        // Sorteret efter strengthpoints
        Arrays.sort(superheroes, new SuperPowerComparator());
        System.out.println("Personliste sorteret efter Superpowers: " + Arrays.toString(superheroes));

        // Sorteret efter boolean
        Arrays.sort(superheroes, new HumanComparator());
        System.out.println("Personliste sorteret efter human: " + Arrays.toString(superheroes));




        // Sortere primært og sekundært.

        ArrayList<Superhero> superheroesList = new ArrayList<Superhero>(List.of(s1,s2,s3,s4,s5));

        Collections.sort(superheroesList, new NameComparator().thenComparing(new IntroYearComparator().reversed()));
        System.out.println("Personliste sorteret efter navn: " + superheroesList);

        Collections.sort(superheroesList, new NameComparator());
        System.out.println("Personliste sorteret primært efter navn, derefter introyear: " + superheroesList);
        */


    }

        FileHandler fileHandler = new FileHandler();
        //ArrayList<Superhero.Superhero> database = fileHandler.loadData((ArrayList<Superhero.Superhero>));
    }
