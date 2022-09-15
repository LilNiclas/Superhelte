import java.util.Scanner;

public class UserInterface {
    Database database = new Database();
    Scanner scan = new Scanner(System.in);
    int count = 1;
    int startside;


    public void userStart() {
        do {
            System.out.println("Velkommen til MySuperheroList");
            System.out.println("1. Opret Superhelte");
            System.out.println("3. Superhelte register");
            System.out.println("5. Søg helte");
            System.out.println("9. Luk programmet");
            System.out.println("-----------------------------");
            startside = scan.nextInt();
            scan.nextLine();

            if (startside == 1) {
                opretHelt();
            } else if (startside == 3) {
                superhelteRegister();
            } else if (startside == 5) {
                søgHelte();
            } else if (startside == 9) {
                System.out.println("Lukker program...");
                System.exit(0);
            }
        } while (startside != 9);
    }

    public void opretHelt() {
        if (startside == 1) {
            System.out.println("Opret en superhelt (" + count + ")");
            count++;

            System.out.print("Indtast superhelt navn: ");
            String navn = scan.nextLine();

            System.out.print("Indtast superkraft: ");
            String superkraft = scan.nextLine();

            System.out.print("Er helten et menneske: (j eller n) ");
            boolean menneske = true;
            char humanSvar = scan.nextLine().charAt(0);
            if (humanSvar == 'n') {
                menneske = false;
            } else if (humanSvar == 'j') {
                menneske = true;
            } else {
                System.out.println("ugyldigt input");
            }

            System.out.print("Heltens introduktionsår: ");
            int introår = scan.nextInt();
            System.out.print("Heltens styrkepoint (et normalt menneske er 1.0): ");
            double styrkepoint = scan.nextDouble();
            System.out.println(" ");

            database.createSuperhero(navn, superkraft, menneske, introår, styrkepoint);
        }


    }

    public void superhelteRegister() {
        if (startside == 3) {
            for (Superhero helt : database.getHelteDatabase()) {

                System.out.println("Superhelte navn: " + helt.getNavn());
                System.out.println("Superkraft: " + helt.getSuperkraft());
                System.out.println("Er helt menneske? " + helt.isMenneske());
                System.out.println("Introduktionsår: " + helt.getIntroår());
                System.out.println("Styrkepoint: " + helt.getStyrkepoint());
                System.out.println(" ");
            }
        }
    }

    public void søgHelte() {
        if (startside == 5) {
            System.out.print("Indtast en karakteristik om helten: ");
            String searchTerm = scan.nextLine();
            Superhero superhero = database.searchFor(searchTerm);
            if (superhero != null) {
                System.out.println(superhero);
            } else {
                System.out.println("intet match");
            }
        }
    }

}