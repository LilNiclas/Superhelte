package Superhero;

public class Superhero{

    private String name;
    private String superPower;
    private boolean human;
    private int introYear;
    private double strengthPoint;

    public Superhero (){
    }
    public Superhero(String name, String superPower, boolean human, int introYear, double strengthPoint) {
        this.name = name;
        this.superPower = superPower;
        this.human = human;
        this.introYear = introYear;
        this.strengthPoint = strengthPoint;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSuperpower() {
        return superPower;
    }
    public void setSuperpower(String superpower) {
        this.superPower = superpower;
    }

    public boolean isHuman() {
        return human;
    }
    public void setHuman(boolean human) {
        this.human = human;
    }

    public int getIntroYear() {
        return introYear;
    }
    public void setIntroYear(int introYear) {
        this.introYear = introYear;
    }

    public double getStrengthPoint() {
        return strengthPoint;
    }
    public void setStrengthPoint(double strengthPoint) {
        this.strengthPoint = strengthPoint;
    }

    public String toString() {
        return ("\nName: " + name + "\n" + "Superpower: " + superPower + "\n" + "Human: " + human
                + "\n" + "Introduction year: " + introYear + "\n" + "Strength points: " + strengthPoint + " \n ");
    }
}