package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public class SuperPowerComparator implements Comparator<Superhero> {
    public int compare (Superhero s1, Superhero s2) {
        return s1.getSuperpower().compareTo(s2.getSuperpower());
    }
}
