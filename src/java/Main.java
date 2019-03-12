package java;

import java.util.Scanner;

public class Main {

    /**
     * Entry point for the program
     * Redirect to the java menu
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Hi, welcome to Gravity is a myth");
        main_menu();
    }

    /**
     * Main menu for the application
     * Allow to navigate to the different features
     */
    private static void main_menu() {
        System.out.println("");
        System.out.println("Select an option");
        System.out.println("1 - Log in a new workout");
        System.out.println("2 - Calculate warm up sets");
        System.out.println("3 - See an previous workout");
        System.out.println("4 - Settings");
        System.out.println("5 - exit");

        //Take the user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an option");
        int n = scan.nextInt();
        scan.close();

        //Redirect to a feature based on the user input
        switch (n) {
            case 1:
                new_workout_menu();
                break;
            case 2:
                warmup_sets_menu();
                break;
            case 3:
                previous_workouts();
                break;
            case 4:
                settings();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("Invalid option. Choose an option again please.");
                main_menu();
        }
    }

    private static void new_workout_menu() {
//        TODO
        System.out.println("TODO");
        main_menu();
    }
    private static void warmup_sets_menu(){
//        TODO
        System.out.println("TODO");
        main_menu();
    }
    private static void previous_workouts(){
//        TODO
        System.out.println("TODO");
        main_menu();
    }
    private static void settings(){
//        TODO
        System.out.println("TODO");
        main_menu();
    }

    /**
     * Exit the program
     */
    private static void exit(){
        System.out.println("See you soon!");
        System.exit(0);
    }
}
