public class Superhero {

    private String navn;
    private String superkraft;
    private boolean menneskeform;
    private int introår;
    private double styrkepoint;

    public Superhero(String navn, String superkraft, boolean menneskeform, int introår, double styrkepoint) {
        this.navn = navn;
        this.superkraft = superkraft;
        this.menneskeform = menneskeform;
        this.introår = introår;
        this.styrkepoint = styrkepoint;
    }


    public Superhero() {
        Superhero brugerHero = new Superhero(navn, superkraft, menneskeform, introår, styrkepoint);
    }

    //getter
    public String getNavn() {
        return navn;
    }

    public String getSuperkraft() {
        return superkraft;
    }

    public boolean getMenneskeform() {
        return menneskeform;
    }

    public int getIntroår() {
        return introår;
    }

    public double getStyrkepoint() {
        return styrkepoint;
    }
}
