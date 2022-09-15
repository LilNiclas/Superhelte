import java.util.Scanner;

public class UserInterface {
    Database database = new Database();
    Scanner scan = new Scanner(System.in);
    int count = 1;
    int menue;


    public void userStart() {
        do {
            System.out.println("Welcome to MySuperheroList");
            System.out.println("1. Create a superhero");
            System.out.println("3. Registered superheroes");
            System.out.println("5. Search for a superhero");
            System.out.println("7. Edit hero");
            System.out.println("9. Exit program");
            System.out.println("-----------------------------");
            menue = scan.nextInt();
            scan.nextLine();

            if (menue == 1) {
                createHero();
            } else if (menue == 3) {
                registerHero();
            } else if (menue == 5) {
                searchHero();
            } else if (menue == 7) {
                editHero();
            } else if (menue == 9) {
                System.out.println("Exiting program...");
                System.exit(0);
            }
        } while (menue != 9);
    }

    public void createHero() {
        if (menue == 1) {
            System.out.println("Create a hero (" + count + ")");
            count++;

            System.out.print("Superhero name: ");
            String name = scan.nextLine();

            System.out.print("Superpower: ");
            String superpower = scan.nextLine();

            System.out.print("Are they human: (y or n) ");
            boolean human = true;
            char humanAnswer = scan.nextLine().charAt(0);
            if (humanAnswer == 'n') {
                human = false;
            } else if (humanAnswer == 'y') {
                human = true;
            } else {
                System.out.println("Invalid input");
            }

            System.out.print("Introduction year: ");
            int introYear = scan.nextInt();
            System.out.print("Strength points (normal human is 1.0): ");
            double strengthPoint = scan.nextDouble();
            System.out.println(" ");

            database.createSuperhero(name, superpower, human, introYear, strengthPoint);
        }
    }

    public void registerHero() {
        if (menue == 3) {
            for (Superhero hero : database.getHeroDatabase()) {

                System.out.println("Superhero name: " + hero.getName());
                System.out.println("Superpower: " + hero.getSuperpower());
                System.out.println("Are they human: " + hero.isHuman());
                System.out.println("Introduction year: " + hero.getIntroYear());
                System.out.println("Strength points: " + hero.getStrengthPoint());
                System.out.println("\n");
            }
        }
    }

    public void searchHero() {
        if (menue == 5) {
            System.out.print("Enter a characteristic about a hero: ");
            String searchTerm = scan.nextLine();
            Superhero superhero = database.searchSuperhero(searchTerm);
        }
    }

    public void editHero() {
        if (menue == 7) {

            System.out.println("Superhelte");
            for (int i = 0; i < database.getHeroDatabase().size(); i++) {
                System.out.println(i + 1 + ":" + database.getHeroDatabase().get(i));
            }

            System.out.print("Enter the number for the superhero to be edited: ");
            int number = scan.nextInt();
            scan.nextLine();

            Superhero editHero = database.getHeroDatabase().get(number - 1);
            System.out.println("Edit superhero's information: " + editHero);

            System.out.println("Edit data press ENTER. Don't want to edit data press Enter");
            System.out.println("Name: " + editHero.getName());
            String newName = scan.nextLine();
            if (!newName.isEmpty())
                editHero.setName(newName);

            System.out.println("Superpower: " + editHero.getSuperpower());
            String newSuperpower= scan.nextLine();
            if (!newSuperpower.isEmpty())
                editHero.setSuperpower(newSuperpower);

            /*System.out.println("human: " + editHero.getisHuman());
            String newHuman = scan.nextBoolean();
            if (!newHuman.isEmpty())
                editHero.setHuman(newMenneske);*/

            System.out.println("Introduction year: " + editHero.getIntroYear());
            String newIntroYear = scan.nextLine();
            if (!newIntroYear.isEmpty()) {
                editHero.setIntroYear(Integer.parseInt(newIntroYear));
            }

            System.out.println("Strength points: " + editHero.getStrengthPoint());
            String newStrengthpoint = scan.nextLine();
            if (!newStrengthpoint.isEmpty())
                editHero.setStrengthPoint(Double.parseDouble(newStrengthpoint));
        }
    }

}