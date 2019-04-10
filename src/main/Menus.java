package main;

class Menus {
    /**
     * Main menu for the application
     * Allow to navigate to the different features
     */
    void mainMenu() {
        String[] opts = {"Log in a new workout", "Calculate warm up Sets", "See a previous workout", "Settings", "Exit"};
        Options options = new Options(opts);
        boolean again = true;

        while (again) {
            again = false;
            options.optionsPrinter();
            String userInput = Input.input("Choose an option", String.class);

            //Redirect to a feature based on the user input
            assert userInput != null;
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
                    System.out.println("Invalid option. Choose a valid option please.");
                    again = true;
            }
        }
    }

    /**
     * Redirect to the new workout creator
     */
    private void newWorkoutMenu() {
        WorkoutManager workout = new WorkoutManager();
        workout.createWorkout();
    }

    /**
     * Redirect to the warmup sets calculator
     */
    private void warmupSetsMenu() {
//        TODO
        System.out.println("TODO");
        mainMenu();
    }

    /**
     * Redirect to the previous workouts menu
     */
    private void previousWorkouts() {
//        TODO
        System.out.println("TODO");
        mainMenu();
    }

    /**
     * Option selector for the settings menu
     */
    void settingsMenu() {
        String[] opts = {"Plates", "Barbel", "User", "Exercises", "Exit"};
        Options options = new Options(opts);
        boolean again = true;

        while (again) {
            again = false;
            options.optionsPrinter();

            String userInput = Input.input("Choose an option", String.class);

            //Redirect to a feature based on the user input
            switch (userInput) {
                case "1":
                    plateSubmenu();
                    break;
                case "2":
                    barbelSubmenu();
                    break;
                case "3":
                    userSubmenu();
                    break;
                case "4":
                    exercisesSubmenu();
                    break;
                case "5":
                    Main main = new Main();
                    main.exit();
                    break;
                default:
                    System.out.println("Invalid option. Choose a valid option please.");
                    again = true;
            }
        }
    }

    /**
     * Option selector for the plates settings Submenu
     */
    private void plateSubmenu() {
        String[] opts = {"Add plate", "Remove plate", "Modify plate", "Exit"};
        Options options = new Options(opts);
        boolean again = true;

        while (again) {
            again = false;
            options.optionsPrinter();
            String userInput = Input.input("Choose an option", String.class);

            Settings settings = new Settings();
            //Redirect to a feature based on the user input
            switch (userInput) {
                case "1":
                    settings.addPlate();
                    break;
                case "2":
                    settings.deletePlate();
                    break;
                case "3":
                    settings.modifyPlate();
                    break;
                case "4":
                    Main main = new Main();
                    main.exit();
                    break;
                default:
                    System.out.println("Invalid option. Choose a valid option please.");
                    again = true;
            }
        }
    }

    /**
     * Option selector for the barbel settings sub menu
     */
    private void barbelSubmenu() {
        //TODO
        System.out.println("TODO");
        settingsMenu();
    }

    /**
     * Option selector for the user settings sub menu
     */
    private void userSubmenu() {
        //TODO
        System.out.println("TODO");
        settingsMenu();
    }

    /**
     * Option selector for the exercises sub menu
     */
    private void exercisesSubmenu() {
        //TODO
        System.out.println("TODO");
        settingsMenu();
    }
}
