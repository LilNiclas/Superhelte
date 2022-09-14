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

    //getter
    public String getNavn() {
        return navn;
    }

    public String getSuperkraft() {
        return superkraft;
    }

    public boolean isMenneske() {
        return menneske;
    }

    public int getIntroår() {
        return introår;
    }

    public double getStyrkepoint() {
        return styrkepoint;
    }

    /*public String toString(){
        return "Navn: " + navn + "\nSuperkraft: " + superkraft + "\nEr menneske: " + menneskeform +
                "\nIntroduktionsår: " + introår + "\nStyrke: " + styrkepoint + "\n";
    }*/
}
