public class Superhero {

    private String navn;
    private String superkraft;
    private boolean menneske;
    private int introår;
    private double styrkepoint;

    public Superhero(String navn, String superkraft, boolean menneske, int introår, double styrkepoint) {
        this.navn = navn;
        this.superkraft = superkraft;
        this.menneske = menneske;
        this.introår = introår;
        this.styrkepoint = styrkepoint;
    }

    //getter og setter
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getSuperkraft() {
        return superkraft;
    }
    public void setSuperkraft(String superkraft) {
        this.superkraft = superkraft;
    }

    public boolean isMenneske() {
        return menneske;
    }
    public void setMenneske(boolean menneske) {
        this.menneske = menneske;
    }

    public int getIntroår() {
        return introår;
    }
    public void setIntroår(int introår) {
        this.introår = introår;
    }

    public double getStyrkepoint() {
        return styrkepoint;
    }
    public void setStyrkepoint(double styrkepoint) {
        this.styrkepoint = styrkepoint;
    }

    @Override
    public String toString() {
        return ("Name: " + navn + "\n" + "Superkraft: " + superkraft + "\n" + "Menneske: " + menneske
                + "\n" + "Introduktions år: " + introår + "\n" + "Styrkepoint: " + styrkepoint + " \n ");
    }
}
