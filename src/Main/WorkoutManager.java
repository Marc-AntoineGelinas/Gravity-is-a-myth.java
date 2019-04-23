package Main;

import CommandLine.WorkoutManagerPrompts;
import WorkoutComponent.*;

public class WorkoutManager {

    /**
     * Add a workout or exit to the Main menu
     */
    public void addWorkout() {
        WorkoutManagerPrompts prompts = new WorkoutManagerPrompts();

        if (prompts.addWorkOutPrompt()) {
            Workout workout = new Workout();
            configureWorkout(workout);
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
        WorkoutManagerPrompts prompts = new WorkoutManagerPrompts();
        boolean loop = true;
        while (loop) {
            switch (prompts.configureWorkOutPrompt()) {
                case 1:
                    viewWorkout(workout);
                    break;
                case 2:
                    addWarmUpToWorkout(workout);
                    break;
                case 3:
                    addStretchToWorkout(workout);
                    break;
                case 4:
                    addExerciseToWorkout(workout);
                    break;
                case 5:
                    addCardioToWorkout(workout);
                    break;
                case 6:
                    addCooldownToWorkout(workout);
                    break;
                case 7:
                    loop = false;
                    finishWorkout(workout);
                    break;
                default:
                    System.out.println("Invalid option. Choose an option again please.");
            }
        }

    }

    private void viewWorkout(Workout workout) {
        if (workout == null)
            System.out.println("The workout is currently empty.");
         else
            System.out.println("The current workout is : ");
            System.out.println();
            workout.print();
    }

    /**
     * Add a warmup set to the workout
     *
     * @param workout the current workout
     */
    private void addWarmUpToWorkout(Workout workout) {
        WorkoutManagerPrompts p = new WorkoutManagerPrompts();
        WarmUp warmUp = new WarmUp();

        warmUp.setName(p.componentNamePrompt("Name of the warm up : "));
        warmUp.setTime(p.componentTimePrompt());

        //Add the component to the workout
        workout.addWarmup(warmUp);
        System.out.println(warmUp.toString());
        System.out.println("Warm up added successfully.");
    }

    /**
     * Add a stretch set to the workout
     *
     * @param workout the current workout
     */
    private void addStretchToWorkout(Workout workout) {
        WorkoutManagerPrompts p = new WorkoutManagerPrompts();
        Stretch stretch = new Stretch();

        stretch.setName(p.componentNamePrompt("Name of the stretch : "));
        stretch.setTime(p.componentTimePrompt());
        stretch.setReps(p.componentRepsPrompt());

        //Add the component to the workout
        workout.addStretch(stretch);
        System.out.println(stretch.toString());
        System.out.println("Stretch added successfully.");
    }

    /**
     * Add an exercise set to the workout
     *
     * @param workout the current workout
     */
    private void addExerciseToWorkout(Workout workout) {
        WorkoutManagerPrompts p = new WorkoutManagerPrompts();
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
        WorkoutManagerPrompts p = new WorkoutManagerPrompts();
        Cardio cardio = new Cardio();

        cardio.setName(p.componentNamePrompt("Name of the cardio : "));
        cardio.setTime(p.componentTimePrompt());
        cardio.setCalories(p.componentCaloriesPrompt());
        cardio.setDistance(p.componentDistancePrompt());
        cardio.setDistanceUnit(p.componentDistanceUnitPrompt());

        workout.addCardio(cardio);
        System.out.println(cardio.toString());
        System.out.println("Cardio added successfully.");
    }

    /**
     * Add a cooldown set to the workout
     *
     * @param workout the current workout
     */
    private void addCooldownToWorkout(Workout workout) {
        WorkoutManagerPrompts p = new WorkoutManagerPrompts();
        Cooldown cooldown = new Cooldown();

        cooldown.setName(p.componentNamePrompt("Name of the cooldown : "));
        cooldown.setTime(p.componentTimePrompt());

        workout.addCooldown(cooldown);
        System.out.println(cooldown.toString());
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
