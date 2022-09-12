import java.util.Scanner;

public class Main {

    private Database database = new Database();

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lav en super helt");
        System.out.print("Indtast superhelt navn: ");
        String navn = scan.nextLine();

        System.out.print("Indtast superkraft: ");
        String superkraft = scan.nextLine();

        System.out.print("Er helten et menneske: ");
        String menneskeForm = scan.nextLine();

        System.out.print("Heltens introduktionsår: ");
        int introår = scan.nextInt();

        System.out.print("Heltens styrkepoint: ");
        int styrkepoint = scan.nextInt();
    }

    //metode til database

}
