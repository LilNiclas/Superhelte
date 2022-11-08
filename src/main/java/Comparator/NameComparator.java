package Comparator;

import java.util.Comparator;

import Superhero.Superhero;


public class NameComparator implements Comparator<Superhero> {
    public int compare (Superhero s1, Superhero s2) {
        return s1.getName().compareTo(s2.getName());
    }
}


