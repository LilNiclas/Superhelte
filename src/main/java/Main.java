import java.util.Scanner;

public class Main {

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Lav en super helt");
        System.out.print("Indatst superhelt navn: ");
        String navn = scan.nextLine();

        System.out.print("Indtast superkraft: ");
        String superkraft = scan.nextLine();

        System.out.print("Er helten et menneske: ");
        String menneske = scan.nextLine();

        System.out.print("Heltens introduktionsår: ");
        int introår = scan.nextInt();

        System.out.print("Heltens styrkepoint: ");
        int styrkepoint  = scan.nextInt();

        Superhero brugerSup = new Superhero(navn, superkraft, menneske, introår, styrkepoint);
    }

}
