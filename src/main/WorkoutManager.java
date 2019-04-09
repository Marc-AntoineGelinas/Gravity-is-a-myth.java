package main;

import WorkoutComponent.*;

import java.sql.Time;

public class WorkoutManager {

    void createWorkout() throws Exception {
        System.out.println();
        System.out.println("Create new workout?");
        String userInput = Input.input("Yes/no", String.class);

        //TODO : Ajouter validation
        if (userInput.toLowerCase().equals("yes")) {
            Workout workout = new Workout();
            configureWorkout(workout);
        } else if (userInput.toLowerCase().equals("no")) {
            Menus menus = new Menus();
            menus.mainMenu();
        }
    }

    private void configureWorkout(Workout workout) {
        System.out.println();
        System.out.println("1 - Add warmup");
        System.out.println("2 - Add stretch");
        System.out.println("3 - Add exercise");
        System.out.println("4 - Add cardio");
        System.out.println("5 - Add cooldown");
        System.out.println("6 - Finish workout");
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
            case "4" :
                addCardioToWorkout(workout);
                break;
            case "5" :
                addCooldownToWorkout(workout);
                break;
            case "6" :
                finishWorkout(workout);
                break;
            default :
                System.out.println("Wrong option");
        }
    }

    private String name(){
        //TODO : Add validations
      return Input.input("Name of the warmup : ", String.class);
    }

    private Time time(){
        //TODO : Add validations
        int minutes = Input.input("For how much time (minutes) : ", int.class);
        int seconds = Input.input("For how much time (seconds) : ", int.class);
        return new Time(0, minutes, seconds);
    }

    private void sets(Sets sets){
        int series = series();
        int[] reps = reps(series);
        float[] weight = weight(series);
        Time[] rest = rest(series);

    }

    private void addWarmupToWorkout(Workout workout) {
        String name = name();
        Time time = time();
        Warmup warmup = new Warmup(name, time);

        workout.addWarmup(warmup);
    }

    private void addStretchToWorkout(Workout workout){
        String name = name();
        Time time = time();
        //TODO : Add validation
        int reps = Input.input("How many repetitions : ", int.class);
        Stretch stretch = new Stretch(name, time, reps);

        workout.addStretch(stretch);
    }

    private void addExerciseToWorkout(Workout workout){
        String name = name();
        Sets sets = new Sets();
        sets(sets);

    }

    private void addCardioToWorkout(Workout workout){

    }

    private void addCooldownToWorkout(Workout workout){

    }

    private void finishWorkout(Workout workout){

    }
}
