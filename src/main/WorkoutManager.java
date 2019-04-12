package main;

import WorkoutComponent.*;

class WorkoutManager {

    /**
     * Add a workout or exit to the main menu
     */
    void createWorkout() {
        boolean again = true;
        while (again) {
            again = false;
            System.out.println();
            System.out.println("Create new workout?");
            Input<String> userInput = new Input<>("yes/no", String.class);

            //TODO : Ajouter validation
            if (userInput.getValue().equals("yes")) {
                Workout workout = new Workout();
                configureWorkout(workout);
            } else if (userInput.getValue().equals("no")) {
                Menus menus = new Menus();
                menus.mainMenu();
            } else {
                System.out.println("Invalid option. Choose an option again please");
                again = true;
            }
        }
    }

    /**
     * Option selector for the creation of the workout
     * User is prompted to add a move to the workout
     * When done he can log the workout to his database
     *
     * @param workout the current workout
     */
    private void configureWorkout(Workout workout) {
        String[] opts = {"Add warmup", "Add stretch", "Add exercise", "Add cardio", "Add cooldown", "Finish workout"};
        Options options = new Options(opts);
        boolean again = true;

        while (again) {
            options.optionsPrinter();
            Input<String> userInput = new Input<>("Choose an option : ", String.class);


            switch (userInput.getValue()) {
                case "1":
                    addWarmUpToWorkout(workout);
                    break;
                case "2":
                    addStretchToWorkout(workout);
                    break;
                case "3":
                    addExerciseToWorkout(workout);
                    break;
                case "4":
                    addCardioToWorkout(workout);
                    break;
                case "5":
                    addCooldownToWorkout(workout);
                    break;
                case "6":
                    again = false;
                    finishWorkout(workout);
                    break;
                default:
                    System.out.println("Invalid option. Choose an option again please.");
                    again = true;
            }
        }
    }

    /**
     * Add a warmup set to the workout
     *
     * @param workout the current workout
     */
    private void addWarmUpToWorkout(Workout workout) {
        WarmUp warmUp = new WarmUp();
        workout.addWarmup(warmUp);
        System.out.println("Warm up added successfully.");
    }

    /**
     * Add a stretch set to the workout
     *
     * @param workout the current workout
     */
    private void addStretchToWorkout(Workout workout) {
        Stretch stretch = new Stretch();
        workout.addStretch(stretch);
        System.out.println("Stretch added successfully.");
    }

    /**
     * Add an exercise set to the workout
     *
     * @param workout the current workout
     */
    private void addExerciseToWorkout(Workout workout) {
        Exercise exercise = new Exercise();
        workout.addExercise(exercise);
        System.out.println("Exercise added successfully.");
    }

    /**
     * Add a cardio set to the workout
     *
     * @param workout the current workout
     */
    private void addCardioToWorkout(Workout workout) {
        Cardio cardio = new Cardio();
        workout.addCardio(cardio);
        System.out.println("Cardio added successfully.");
    }

    /**
     * Add a cooldown set to the workout
     *
     * @param workout the current workout
     */
    private void addCooldownToWorkout(Workout workout) {
        Cooldown cooldown = new Cooldown();
        workout.addCooldown(cooldown);
        System.out.println("Cooldown added successfully.");
    }

    /**
     * Finish the workout and add to the user's database
     *
     * @param workout the current workout
     */

    private void finishWorkout(Workout workout) {

    }
}
