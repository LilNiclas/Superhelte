public class Database {


    private Superhero superhero = new Superhero();

    public void Superhero() {

        Superhero helt1 = new Superhero(superhero.getNavn(), superhero.getSuperkraft(),
                superhero.getMenneskeform(), superhero.getIntroår(), superhero.getStyrkepoint());

        Superhero helt2 = new Superhero(superhero.getNavn(), superhero.getSuperkraft(),
                superhero.getMenneskeform(), superhero.getIntroår(), superhero.getStyrkepoint());

        Superhero helt3 = new Superhero(superhero.getNavn(), superhero.getSuperkraft(),
                superhero.getMenneskeform(), superhero.getIntroår(), superhero.getStyrkepoint());

        Superhero helt4 = new Superhero(superhero.getNavn(), superhero.getSuperkraft(),
                superhero.getMenneskeform(), superhero.getIntroår(), superhero.getStyrkepoint());

        Superhero helt5 = new Superhero(superhero.getNavn(), superhero.getSuperkraft(),
                superhero.getMenneskeform(), superhero.getIntroår(), superhero.getStyrkepoint());

        Superhero[] superheroArray = new Superhero[]{helt1, helt2, helt3, helt4, helt5};
    }
}
