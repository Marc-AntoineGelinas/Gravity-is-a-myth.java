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
        switch (prompts.configureWorkOutPrompt()) {
            case 1:
                addWarmUpToWorkout(workout);
                break;
            case 2:
                addStretchToWorkout(workout);
                break;
            case 3:
                addExerciseToWorkout(workout);
                break;
            case 4:
                addCardioToWorkout(workout);
                break;
            case 5:
                addCooldownToWorkout(workout);
                break;
            case 6:
                finishWorkout(workout);
                break;
            default:
                System.out.println("Invalid option. Choose an option again please.");
        }

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
        Stretch stretch = new Stretch();
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
