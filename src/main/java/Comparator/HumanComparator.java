package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public class HumanComparator implements Comparator<Superhero> {
    public int compare (Superhero s1, Superhero s2) {
        return Boolean.compare(s1.isHuman(),s2.isHuman());
        }
    }