import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] arg) {
        Database database = new Database();
        int count = 1;
        int startside;
        System.out.println("Velkommen til MySuperheroList");
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("1. Opret Superhelte");
            System.out.println("3. Superhelte register");
            System.out.println("9. Luk programmet");
            startside = scan.nextInt();
            scan.nextLine();
            System.out.println("-----------------------------");


            if (startside == 1) {
                System.out.println("Opret en superhelt (" + count + ")");
                count++;

                System.out.print("Indtast superhelt navn: ");
                String navn = scan.nextLine();

                System.out.print("Indtast superkraft: ");
                String superkraft = scan.nextLine();

                System.out.print("Er helten et menneske (j eller n: )");
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

            if (startside == 3) {
                for (Superhero helt : database.getHelteDatabase()) {

                    System.out.println("Superhelte navn: " + helt.getNavn());
                    System.out.println("Superkraft: " + helt.getSuperkraft());
                    System.out.println("Er helt menneske?" + helt.isMenneske());
                    System.out.println("Introduktionsår: " + helt.getIntroår());
                    System.out.println("Styrkepoint: " + helt.getStyrkepoint());
                }
            }

            if (startside == 9) {
                System.out.println("Lukker programmet...");
            }


        } while (startside != 9);
    }
}


