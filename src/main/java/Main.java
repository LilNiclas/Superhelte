import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Database database = new Database();
        int count = 1;
        int startside;

        System.out.println("Velkommen til MySuperheroList");
        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("1. Opret Superhelte");
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

                System.out.print("Er helten et menneske (true eller false): ");
                boolean menneskeForm = scan.nextBoolean();

                System.out.print("Heltens introduktionsår: ");
                int introår = scan.nextInt();

                System.out.print("Heltens styrkepoint (et normalt menneske er 1.0): ");
                double styrkepoint = scan.nextDouble();
                System.out.println(" ");

                database.createSuperhero(navn, superkraft, menneskeForm, introår, styrkepoint);
            }
                else if (startside == 9) {
                System.out.println("Lukker programmet...");
            }
        } while (startside != 9);

    }
}
