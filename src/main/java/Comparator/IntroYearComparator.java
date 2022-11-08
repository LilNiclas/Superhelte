package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public class IntroYearComparator implements Comparator<Superhero> {
    public int compare (Superhero s1, Superhero s2) {
        return  s2.getIntroYear()-s1.getIntroYear() ;
    }
}
