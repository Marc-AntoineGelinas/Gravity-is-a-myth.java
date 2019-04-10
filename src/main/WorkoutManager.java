package main;

import WorkoutComponent.*;

import java.sql.Time;

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
            String userInput = Input.input("yes/no", String.class);

            //TODO : Ajouter validation
            if (userInput.toLowerCase().equals("yes")) {
                Workout workout = new Workout();
                configureWorkout(workout);
            }
            else if (userInput.toLowerCase().equals("no")) {
                Menus menus = new Menus();
                menus.mainMenu();
            }
            else {
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
            String userInput = Input.input("Choose an option", String.class);

            switch (userInput) {
                case "1":
                    addWarmupToWorkout(workout);
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
                    finishWorkout(workout);
                    break;
                default:
                    System.out.println("Invalid option. Choose an option again please.");
                    again = true;
            }
        }
    }

    /**
     * User given name for a move
     *
     * @return the name of the move
     */
    private String name() {
        //TODO : Add validations
        return Input.input("Name of the warmup : ", String.class);
    }

    /**
     * User given time for a given move
     *
     * @return the time for a given move
     */
    private Time time() {
        //TODO : Add validations
        int minutes = Input.input("For how much time (minutes) : ", Integer.class);
        int seconds = Input.input("For how much time (seconds) : ", Integer.class);
        return new Time(0, minutes, seconds);
    }

    /**
     * Create a set
     *
     * @return a set for the given exercise
     */
    private Sets createSet() {
        int series = series();
        int[] reps = reps(series);
        float[] weight = weight(series);
        Time[] rest = rest(series);
        return new Sets(series, reps, weight, rest);
    }

    /**
     * User given series for an exercise
     *
     * @return the number of series for the set
     */
    private int series() {
        //TODO : Add validation
        return Input.input("How many series : ", Integer.class);
    }

    /**
     * User given reps for each serie
     *
     * @param series the number of series of the set
     * @return the reps for each series
     */
    private int[] reps(int series) {
        int[] reps = null;
        for (int x = 0; x < series; x++) {
            //TODO : Add validation
            reps[x] = Input.input("How many reps for serie " + x + 1 + " : ", Integer.class);
        }
        return reps;
    }

    /**
     * User given weight for each serie
     *
     * @param series the number of series of the set
     * @return the weight for each series
     */
    private float[] weight(int series) {
        float[] weights = null;
        for (int x = 0; x < series; x++) {
            //TODO : Add validation
            weights[x] = Input.input("How much weight for serie " + x + 1 + " : ", Integer.class);
        }
        return weights;
    }

    /**
     * User given rest time inbetween series
     *
     * @param series the number of series of the set
     * @return the rest time inbetween series
     */
    private Time[] rest(int series) {
        Time[] rest = null;
        //1 less rest period since no rest after last serie
        for (int x = 0; x < series - 1; x++) {
            //TODO : Add validation
            int minutes = Input.input("How many rest minutes for serie " + x + 1 + " : ", Integer.class);
            int seconds = Input.input("How many rest seconds for serie " + x + 1 + " : ", Integer.class);
            rest[x] = new Time(0, minutes, seconds);
        }
        return rest;
    }

    /**
     * Create warmup series
     * Return a % of the target weight based on how many warmup series
     * Return a number of reps based on the reps of the series
     *
     * @param sets the set to add warmup set
     */
    //TODO : Create warmup object
    private void warmupSets(Sets sets) {
        int warmupSeries = Input.input("How many warmup series : ", Integer.class);
        //Return the target weight for the first serie
        float weight = sets.getWeight()[0];

        if (weight < 45) {

        }
    }

    /**
     * Add a warmup set to the workout
     *
     * @param workout the current workout
     */
    private void addWarmupToWorkout(Workout workout) {
        String name = name();
        Time time = time();
        Warmup warmup = new Warmup(name, time);

        workout.addWarmup(warmup);
    }

    /**
     * Add a stretch set to the workout
     *
     * @param workout the current workout
     */
    private void addStretchToWorkout(Workout workout) {
        String name = name();
        Time time = time();
        //TODO : Add validation
        int reps = Input.input("How many repetitions : ", Integer.class);
        Stretch stretch = new Stretch(name, time, reps);

        workout.addStretch(stretch);
    }

    /**
     * Add an exercise set to the workout
     *
     * @param workout the current workout
     */
    private void addExerciseToWorkout(Workout workout) {
        String name = name();
        Sets sets = createSet();
        warmupSets(sets);

    }

    /**
     * Add a cardio set to the workout
     *
     * @param workout the current workout
     */
    private void addCardioToWorkout(Workout workout) {

    }

    /**
     * Add a cooldown set to the workout
     *
     * @param workout the current workout
     */
    private void addCooldownToWorkout(Workout workout) {

    }

    /**
     * Finish the workout and add to the user's database
     *
     * @param workout the current workout
     */

    private void finishWorkout(Workout workout) {

    }
}
