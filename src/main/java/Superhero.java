public class Superhero {

    private String name;
    private String superpower;
    private boolean human;
    private int introYear;
    private double strengthPoint;

    public Superhero(String name, String superpower, boolean menneske, int introYear, double strengthPoint) {
        this.name = name;
        this.superpower = superpower;
        this.human = menneske;
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
        return superpower;
    }
    public void setSuperpower(String superpower) {
        this.superpower = superpower;
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

    @Override
    public String toString() {
        return ("Name: " + name + "\n" + "Superpower: " + superpower + "\n" + "Human: " + human
                + "\n" + "Introduction year: " + introYear + "\n" + "Strength points: " + strengthPoint+ " \n ");
    }
}
