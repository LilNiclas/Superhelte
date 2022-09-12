public class Superhero {

    private String navn;
    private String superkraft;
    private String menneskeform;
    private int introår;
    private int styrkepoint;

    public Superhero(String navn, String superkraft, String menneskeform, int introår, int styrkepoint) {
        this.navn = navn;
        this.superkraft = superkraft;
        this.menneskeform = menneskeform;
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

    public String getMenneskeform() {
        return menneskeform;
    }

    public int getIntroår() {
        return introår;
    }

    public int getStyrkepoint() {
        return styrkepoint;
    }
}
