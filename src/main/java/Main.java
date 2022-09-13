import java.util.ArrayList;
import java.util.Arrays;
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

                System.out.print("Er helten et menneske (ja eller nej): ");
                char menneske = scan.nextLine().charAt(0);
                if(menneske == 'n'){
                    System.out.println("Nej");}
                else if(menneske =='j'){
                    System.out.println("Ja");}


                System.out.print("Heltens introduktionsår: ");
                int introår = scan.nextInt();

                System.out.print("Heltens styrkepoint (et normalt menneske er 1.0): ");
                double styrkepoint = scan.nextDouble();
                System.out.println(" ");

                database.createSuperhero(navn, superkraft, menneske, introår, styrkepoint);

            }

            if (startside == 3) {
               /* for (Object helt : database.getHelteDatabase()) {
                    System.out.printf("%s%s%b%d%f", helt.getNavn, helt.getSuperkraft, helt.getMenneskeForm, helt.getIntroår, helt.getStyrkepoint);*/

            } else if (startside == 9) {
                System.out.println("Lukker programmet...");
            }
        } while (startside != 9);
    }
}
