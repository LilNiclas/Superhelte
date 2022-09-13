public class Superhero {

    private String navn;
    private String superkraft;
    private char menneske;
    private int introår;
    private double styrkepoint;

    public Superhero(String navn, String superkraft, char menneske, int introår, double styrkepoint) {
        this.navn = navn;
        this.superkraft = superkraft;
        this.menneske = menneske;
        this.introår = introår;
        this.styrkepoint = styrkepoint;
    }


   public Superhero() {
        Superhero brugerHero = new Superhero(navn, superkraft, menneske, introår, styrkepoint);
    }

    //getter
    public String getNavn() {
        return navn;
    }

    public String getSuperkraft() {
        return superkraft;
    }

    public char getMenneskeform() {
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
