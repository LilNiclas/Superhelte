import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Database database = new Database();
        database.createSuperhelte();
        Scanner scan = new Scanner(System.in);

        System.out.println("Velkommen til MySuperheroList");
        System.out.println("1. Opret Superhelte");
        System.out.println("9. Luk programmet");
        int startside = scan.nextInt();
        System.out.println(" ");

        if (startside < 2) {
            int count = 1;
            do {
                System.out.println("Lav en superhelt (" + count + ")");
                count++;

                String navn = scan.nextLine();
                System.out.print("Indtast superhelt navn: ");

                String superkraft = scan.nextLine();
                System.out.print("Indtast superkraft: ");

                String menneskeForm1 = scan.nextLine();
                System.out.print("Er helten et menneske: ");

                String menneskeForm = scan.nextLine();
                System.out.print("Heltens introduktionsår: ");

                int introår = scan.nextInt();
                System.out.print("Heltens styrkepoint: ");
                int styrkepoint1 = scan.nextInt();

            } while (count <= 5);
        }

        if (startside > 2) {
            System.out.println("Lukker programmet...");
        }


    }

    //metode til database

}
