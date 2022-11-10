package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public class FlexibleComparator implements Comparator<Superhero> {

    private int sortBy;

    public FlexibleComparator(int sortBy) {
        this.sortBy = sortBy;
    }

    @Override
    public int compare(Superhero s1, Superhero s2) {

        switch (sortBy) {
            //Name
            case 1 -> { //name
                return s1.getName().compareTo(s2.getName());
            }
            //Superpowers
            case 2 -> {
                return s1.getSuperpower().compareTo(s2.getSuperpower());
            }
            //Menneskestatus
            case 3 -> {
                return Boolean.compare(s1.isHuman(), s2.isHuman());
            }
            //Introyear
            case 4 -> {
                return Integer.compare(s1.getIntroYear(), s2.getIntroYear());
            }
            // Strengthpoints
            case 5 -> {
                return Double.compare(s1.getStrengthPoint(), s2.getStrengthPoint());
            }
        }
        return 0;
    }
}
