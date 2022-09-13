import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Database database = new Database();
        int count = 1;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Velkommen til MySuperheroList");
            System.out.println("1. Opret Superhelte");
            System.out.println("9. Luk programmet");
            int startside = scan.nextInt();
            System.out.println("-----------------------------");

            if (startside < 2) {

                System.out.println("Lav en superhelt (" + count + ")");
                count++;

                System.out.print("Indtast superhelt navn: ");
                String navn = scan.next();

                System.out.print("Indtast superkraft: ");
                String superkraft = scan.next();

                System.out.print("Er helten et menneske: ");
                boolean menneskeForm = scan.nextBoolean();

                System.out.print("Heltens introduktionsår: ");
                int introår = scan.nextInt();

                System.out.print("Heltens styrkepoint: ");
                int styrkepoint = scan.nextInt();
                System.out.println(" ");

                database.createSuperhelte(navn, superkraft, menneskeForm, introår, styrkepoint);
            }

            if (startside > 2) {
                System.out.println("Lukker programmet...");
            }
        } while (true);
    }

    //metode til database

}
