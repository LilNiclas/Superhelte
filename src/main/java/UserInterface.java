import Superhero.Superhero;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    Controller controller = new Controller();
    Scanner scan = new Scanner(System.in);
    int count = 1;
    int menu = 0;

    public void userStart() {
        controller.createTestData();
        boolean writingError = false;
        do {
            System.out.println("\u001B[1mWelcome to MySuperheroList\u001B[0m");
            System.out.println("\u001B[1m1.\u001B[0m Create a superhero");
            System.out.println("\u001B[1m2.\u001B[0m Registered superheroes");
            System.out.println("\u001B[1m3.\u001B[0m Search for a superhero");
            System.out.println("\u001B[1m4.\u001B[0m Edit hero");
            System.out.println("\u001B[1m5.\u001B[0m Delete hero");
            System.out.println("\u001B[1m6.\u001B[0m Save Heroes");
            System.out.println("\u001B[1m7.\u001B[0m Load Heroes");
            System.out.println("\u001B[1m8.\u001B[0m Sort Heroes");
            System.out.println("\u001B[1m9.\u001B[0m Exit program");
            System.out.println("\u001B[1m-----------------------------\u001B[0m");

            try {
                menu = scan.nextInt();
                scan.nextLine();

                if (menu == 1) {
                    createHero();
                } else if (menu == 2) {
                    registeredHero();
                } else if (menu == 3) {
                    searchHero();
                } else if (menu == 4) {
                    editHero();
                } else if (menu == 5) {
                    deleteHero();
                } else if (menu == 6) {
                    saveData();
                } else if (menu == 7) {
                    loadData();
                } else if (menu == 8) {
                    sortData();
                } else if (menu == 9) {
                    System.out.println("\u001B[1mExiting program...\u001B[0m");
                    System.exit(0);
                }
            } catch (InputMismatchException ime) {
                System.out.println("\u001B[4mWriting error, write a number shown on screen\u001B[0m");
                scan.nextLine();
                writingError = true;
            }
        } while (menu != 9 || writingError == true);
    }

    public void createHero() {
        boolean writingError = false;
        if (menu == 1) {

            System.out.println("\u001B[1mCreate a hero (" + count + ")\u001B[0m");
            count++;
            System.out.print("Superhero.Superhero name: ");
            String name = scan.nextLine();

            System.out.print("Superpower: ");
            String superpower = scan.nextLine();


            System.out.print("Are they human: (y or n) ");
            boolean human = true;
            char humanAnswer;
            do {
                humanAnswer = scan.nextLine().charAt(0);
                if (humanAnswer == 'n') {
                    human = false;
                    break;
                } else if (humanAnswer == 'y') {
                    human = true;
                    break;
                } else
                    System.out.println("\u001B[4mWriting error, type y or n\u001B[0m");

            } while (humanAnswer != 'y' || humanAnswer != 'n');


            System.out.print("Introduction year: ");
            int introYear = 0;
            do {
                try {
                    introYear = scan.nextInt();
                    scan.nextLine();
                    writingError = false;

                } catch (InputMismatchException nfe) {
                    System.out.println("\u001B[4mWriting error, write in intergers\u001B[0m");
                    scan.nextLine();
                    writingError = true;

                }
            } while (writingError == true);


            System.out.print("Strength points (normal human is 1.0): ");
            double strengthPoint = 0;
            do {
                try {
                    strengthPoint = scan.nextDouble();
                    scan.nextLine();
                    System.out.println(" ");
                    writingError = false;
                } catch (InputMismatchException nfe) {
                    System.out.println("\u001B[4mWriting error, try writing in numbers\u001B[0m");
                    scan.nextLine();
                    writingError = true;

                }
            } while (writingError == true);

            controller.createSuperhero(name, superpower, human, introYear, strengthPoint);
        }
    }

    public void registeredHero() {
        if (menu == 2) {
            System.out.println("\u001B[1mRegistered heroes\u001B[0m");

            if (controller.getHeroDatabase().isEmpty()) {
                System.out.println("\u001B[4mNo superheroes were found\u001B[0m");
                System.out.println("");
            } else {
                for (Superhero hero : controller.getHeroDatabase()) {
                    System.out.println("Superhero.Superhero name: " + hero.getName());
                    System.out.println("Superpower: " + hero.getSuperpower());
                    if (hero.isHuman() == true)
                        System.out.println("Are they human: Yes");
                    else
                        System.out.println("Are they human: No");
                    System.out.println("Introduction year: " + hero.getIntroYear());
                    System.out.println("Strength points: " + hero.getStrengthPoint());
                    System.out.println("");
                }
            }
        }
    }

    public void searchHero() {
        if (menu == 3) {
            System.out.println("\u001B[1mSearch for a superhero\u001B[0m");
            System.out.print("Enter a characteristic about a hero: ");
            String searchTerm = scan.nextLine();
            System.out.println("");

            ArrayList<Superhero> searchResult = controller.searchSuperhero(searchTerm);

            if (searchResult.isEmpty()) {
                System.out.println("\u001B[4mNo superheroes were found\u001B[0m");
                System.out.println("");
            } else {
                System.out.println("\u001B[1mSuperheroes found\u001B[0m");
                for (Superhero hero : searchResult) {
                    System.out.println("Superhero.Superhero name: " + hero.getName());
                    System.out.println("Superpower: " + hero.getSuperpower());
                    if (hero.isHuman() == true)
                        System.out.println("Are they human: Yes");
                    else
                        System.out.println("Are they human: No");
                    System.out.println("Introduction year: " + hero.getIntroYear());
                    System.out.println("Strength points: " + hero.getStrengthPoint());
                    System.out.println("");
                }
            }
        }
    }

    public void editHero() {
        boolean writingError = false;
        int number;
        if (menu == 4) {
            do {
                System.out.println("\u001B[1mEdit superhero\u001B[0m");
                for (int i = 0; i < controller.getHeroDatabase().size(); i++)
                    System.out.println(i + 1 + ". " + controller.getHeroDatabase().get(i));

                System.out.print("\u001B[1mEnter the number for the superhero to be edited: \u001B[0m");
                number = scan.nextInt();
                scan.nextLine();


                if (number <= controller.getHeroDatabase().size()) {

                    Superhero editHero = controller.getHeroDatabase().get(number - 1);
                    System.out.println("Edit superhero's information: " + editHero);

                    System.out.println("Edit data: Type and then press ENTER. Don't edit data: Press Enter");
                    System.out.println("Name: " + editHero.getName());
                    String newName = scan.nextLine().trim();
                    if (!newName.isEmpty()) {
                        editHero.setName(newName);
                        controller.setChangesMade(true);
                    }

                    System.out.println("Superpower: " + editHero.getSuperpower());
                    String newSuperpower = scan.nextLine().trim();
                    if (!newSuperpower.isEmpty()) {
                        editHero.setSuperpower(newSuperpower);
                        controller.setChangesMade(true);
                    }


                    if (editHero.isHuman() == true)
                        System.out.println("Human (type true/false): Yes");
                    else
                        System.out.println("Human (type true/false): No");
                    String newHuman = scan.nextLine().trim();
                    if (!newHuman.isEmpty()) {
                        editHero.setHuman(Boolean.parseBoolean(newHuman));
                        controller.setChangesMade(true);
                    } else
                        System.out.println("\u001B[4mInvalid input\u001B[0m");


                    System.out.println("Introduction year: " + editHero.getIntroYear());
                    do {
                        String newIntroYear = scan.nextLine().trim();
                        if (!newIntroYear.isEmpty()) {
                            try {
                                editHero.setIntroYear(Integer.parseInt(newIntroYear));
                                writingError = false;

                            } catch (NumberFormatException nfe) {
                                System.out.println("\u001B[4mWriting error, type in numbers\u001B[0m");
                                writingError = true;
                            }
                        }
                    } while (writingError == true);


                    System.out.println("Strength points: " + editHero.getStrengthPoint());
                    do {
                        String newStrengthpoint = scan.nextLine().trim();
                        if (!newStrengthpoint.isEmpty()) {
                            try {
                                editHero.setStrengthPoint(Double.parseDouble(newStrengthpoint));
                                writingError = false;
                            } catch (NumberFormatException nfe) {
                                System.out.println("\u001B[4mWriting error, type in numbers\u001B[0m");
                                writingError = true;
                            }
                            controller.setChangesMade(true);
                        }
                    } while (writingError == true);
                    System.out.println("");


                } else
                    System.out.println("\u001B[4mWriting error, the character written isn't set to a hero\u001B[0m\n");

            } while (number > controller.getHeroDatabase().size());
        }
    }

    public void deleteHero() {
        boolean deleteHeroes = false;
        if (menu == 5) {
            System.out.println("\u001B[1mDelete superhero\u001B[0m");
            for (int i = 0; i < controller.getHeroDatabase().size(); i++)
                System.out.println(i + 1 + ": " + controller.getHeroDatabase().get(i));


            System.out.print("Enter the number for the superhero to be deleted: ");
            int number = scan.nextInt();
            scan.nextLine();

            Superhero deleteHero = controller.getHeroDatabase().get(number - 1);
            controller.deleteSuperhero(deleteHero);
            System.out.println("\u001B[1mHero has been deleted\u001B[0m");
            System.out.println("");

        }
    }

    public void saveData() {
        controller.saveData();
        System.out.println("The data have been saved");

    }

    public void loadData() {
        controller.loadData();
        System.out.println("Data loaded");
    }

    public void sortData() {
        int menu1 = 0;
        do {
            System.out.println("\u001B[1m1.\u001B[0m Sort primary");
            System.out.println("\u001B[1m2.\u001B[0m Sort primary data and secondary");
            System.out.println("\u001B[1m3.\u001B[0m Go back");
            System.out.println("\u001B[1m-----------------------------\u001B[0m");

            menu = scan.nextInt();
            if (menu == 1) {
                System.out.println("\u001B[1m1.\u001B[0m Sort by name");
                System.out.println("\u001B[1m2.\u001B[0m Sort by superpowers ");
                System.out.println("\u001B[1m3.\u001B[0m Sort by humanstatus");
                System.out.println("\u001B[1m4.\u001B[0m Sort by introyear");
                System.out.println("\u001B[1m5.\u001B[0m Sort by strength");
                System.out.println("\u001B[1m6.\u001B[0m Go back");
                System.out.println("\u001B[1m-----------------------------\u001B[0m");

                menu1 = scan.nextInt();
                if (menu1 == 1) {
                    controller.sortBy(menu1);
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 2) {
                    controller.sortBy(menu1);
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 3) {
                    controller.sortBy(menu1);
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 4) {
                    controller.sortBy(menu1);
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 5) {
                    controller.sortBy(menu1);
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                }

            } else if (menu == 2) {
                System.out.println("\u001B[1m1.\u001B[0m Sort primary data by name");
                System.out.println("\u001B[1m2.\u001B[0m Sort primary data by superpower");
                System.out.println("\u001B[1m3.\u001B[0m Sort primary data by humanstatus");
                System.out.println("\u001B[1m4.\u001B[0m Sort primary data by introyear");
                System.out.println("\u001B[1m5.\u001B[0m Sort primary data by strengthpoints");
                System.out.println("\u001B[1m6.\u001B[0m Go back");
                System.out.println("\u001B[1m-----------------------------\u001B[0m");

                menu1 = scan.nextInt();

                System.out.println("\u001B[1m1.\u001B[0m Sort secondary data by name");
                System.out.println("\u001B[1m2.\u001B[0m Sort secondary data by superpower");
                System.out.println("\u001B[1m3.\u001B[0m Sort secondary data by humanstatus");
                System.out.println("\u001B[1m4.\u001B[0m Sort secondary data by introyear");
                System.out.println("\u001B[1m5.\u001B[0m Sort secondary data by strengthpoints");
                System.out.println("\u001B[1m6.\u001B[0m Go back");
                System.out.println("\u001B[1m-----------------------------\u001B[0m");

                menu2 = scan.nextInt();

                if (menu1 == 1 && menu2 == 2) {
                    controller.getSortedDatabyNameAndSuperPowers();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 1  && menu2 == 3) {
                    controller.getSortedDataByNameAndHuman();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 1 && menu2 == 4) {
                    controller.getSortedDataByNameAndIntroyear();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 1 && menu2 == 5) {
                    controller.getSortedDataByNameAndStrengthPoints();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 2 && menu2 == 1) {
                    controller.getSortedDataBySuperpowersAndName();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 2 && menu2 == 3) {
                    controller.getSortedDataBySuperpowersAndHuman();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 2 && menu2 == 4) {
                    controller.getSortedDataBySuperpowersAndIntroyear();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 2 && menu2 == 5) {
                    controller.getSortedDataBySuperPowersAndStrengthPoints();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 3 && menu2 == 1) {
                    controller.getSortedDataByHumanAndName();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }

                } else if (menu1 == 3 && menu2 == 2) {
                    controller.getSortedDataByHumanAndSuperPowers();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 3 && menu2 == 4) {
                    controller.getSortedDataByHumanAndIntroyear();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 3 && menu2 == 5) {
                    controller.getSortedDataByHumanAndStrengthPoints();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 4 && menu2 == 1) {
                    controller.getSortedDataByIntroyearAndName();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 4 && menu2 == 2) {
                    controller.getSortedDataByIntroyearAndSuperPowers();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 4 && menu2 == 3) {
                    controller.getSortedDataByIntroyearAndHuman();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 4 && menu2 == 5) {
                    controller.getSortedDataByIntroYearAndStrengthPoints();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 5 && menu2 == 1) {
                    controller.getSortedDataByStrengthPointsAndName();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 5 && menu2 == 2) {
                    controller.getSortedDataByStrengthPointsAndSuperpowers();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 5 && menu2 == 3) {
                    controller.getSortedDataByStrengthPointsAndHuman();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                } else if (menu1 == 5 && menu2 == 4) {
                    controller.getSortedDataByStrengthPointsAndIntroyear();
                    for (Superhero hero : controller.getHeroDatabase()) {
                        System.out.println(hero);
                    }
                }
            }

        } while(menu >2&&menu1 >5);
    }
}

