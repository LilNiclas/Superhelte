package Comparator;

import Superhero.Superhero;

import java.util.Comparator;

public class FlexibleComparator implements Comparator<Superhero> {

    private String sortBy;

    public FlexibleComparator(String sortBy) {
        this.sortBy=sortBy;
    }

    @Override
    public int compare(Superhero s1, Superhero s2) {

        switch(sortBy) {
            //Name
            case "name" -> {
                return s1.getName().compareTo(s2.getName());
            }
            //Introyear
            case "introyear" -> {
                return Integer.compare(s1.getIntroYear(), s2.getIntroYear());
            }
            // Strengthpoints
            case "strengthpoints" -> {
                return Double.compare(s1.getStrengthPoint(), s2.getStrengthPoint());
            }
            //Superpowers
            case "superpowers" -> {
                return s1.getSuperpower().compareTo(s2.getSuperpower());
            }
            //Menneskestatus
            case "ishuman" -> {
                return Boolean.compare(s1.isHuman(), s2.isHuman());
            }
        }
        return 0;
    }
}
