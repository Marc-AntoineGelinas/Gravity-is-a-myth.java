package main;

class Menus {
    /**
     * Main menu for the application
     * Allow to navigate to the different features
     */
    void mainMenu() throws Exception {
        System.out.println();
        System.out.println("Select an option");
        System.out.println("1 - Log in a new workout");
        System.out.println("2 - Calculate warm up sets");
        System.out.println("3 - See an previous workout");
        System.out.println("4 - Settings");
        System.out.println("5 - exit");

        String userInput = Input.input("Choose an option", String.class);

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
                settingsMenu();
                break;
            case "5":
                Main main = new Main();
                main.exit();
                break;
            default:
                System.out.println("Invalid option. Choose an option again please.");
                mainMenu();
        }
    }

    private void newWorkoutMenu() throws Exception {
//        TODO
        System.out.println("TODO");
        mainMenu();
    }

    private void warmupSetsMenu() throws Exception {
//        TODO
        System.out.println("TODO");
        mainMenu();
    }

    private void previousWorkouts() throws Exception{
//        TODO
        System.out.println("TODO");
        mainMenu();
    }

    void settingsMenu() throws Exception {
        System.out.println();
        System.out.println("Select an option");
        System.out.println("1 - Add a plate");
        System.out.println("2 - exit");

        String userInput = Input.input("Choose an option", String.class);

        Settings settings = new Settings();
        //Redirect to a feature based on the user input
        assert userInput != null;
        switch (userInput) {
            case "1":
                settings.addPlate();
                break;
            case "2":
                Main main = new Main();
                main.exit();
                break;
            default:
                System.out.println("Invalid option. Choose an option again please.");
                settingsMenu();
        }
    }


}
