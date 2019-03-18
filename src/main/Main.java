package main;

public class Main {

    /**
     * Entry point for the program
     * Redirect to the java menu
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        System.out.print("Hi, welcome to Gravity is a myth");
        Menus menus = new Menus();
        menus.mainMenu();
    }


    /**
     * Exit the program
     */
    void exit() {
        System.out.println("See you soon!");
        System.exit(0);
    }
}
