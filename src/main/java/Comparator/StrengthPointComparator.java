package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public class StrengthPointComparator implements Comparator<Superhero> {
    public int compare (Superhero s1, Superhero s2) {
        return Double.compare (s1.getStrengthPoint(), s2.getStrengthPoint());
    }
}

