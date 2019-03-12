package main;

import java.util.Scanner;

public class Main {

    /**
     * Entry point for the program
     * Redirect to the java menu
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Hi, welcome to Gravity is a myth");
        Main main = new Main();
        main.main_menu();
    }

    /**
     * Main menu for the application
     * Allow to navigate to the different features
     */
    private void main_menu() {
        System.out.println();
        System.out.println("Select an option");
        System.out.println("1 - Log in a new workout");
        System.out.println("2 - Calculate warm up sets");
        System.out.println("3 - See an previous workout");
        System.out.println("4 - Settings");
        System.out.println("5 - exit");

        Input input = new Input();
        String userInput = input.input("Choose an option");

        Validation validate = new Validation();
        validate.validate_user_input(userInput);

        //Redirect to a feature based on the user input
        switch (userInput) {
            case "1":
                newWorkoutMenu();
                break;
            case "2":
                warmupSetsMenu();
                break;
            case "3":
                previousWorkouts();
                break;
            case "4":
                settings();
                break;
            case "5":
                exit();
                break;
            default:
                System.out.println("Invalid option. Choose an option again please.");
                main_menu();
        }
    }



    private static void newWorkoutMenu() {
//        TODO
        System.out.println("TODO");
        Main main = new Main();
        main.main_menu();
    }
    private static void warmupSetsMenu(){
//        TODO
        System.out.println("TODO");
        Main main = new Main();
        main.main_menu();
    }
    private static void previousWorkouts(){
//        TODO
        System.out.println("TODO");
        Main main = new Main();
        main.main_menu();
    }
    private static void settings(){
//        TODO
        System.out.println("TODO");
        Main main = new Main();
        main.main_menu();
    }

    /**
     * Exit the program
     */
    private static void exit(){
        System.out.println("See you soon!");
        System.exit(0);
    }
}
