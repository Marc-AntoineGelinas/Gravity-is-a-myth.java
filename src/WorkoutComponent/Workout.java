package WorkoutComponent;

import CommandLine.WorkoutCL;

import java.util.ArrayList;
import java.util.Date;

public class Workout {
    private String workoutDateTime;
    private ArrayList<WarmUp> warmUpList = new ArrayList<WarmUp>();
    private ArrayList<Stretch> stretchList = new ArrayList<Stretch>();
    private ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();
    private ArrayList<Cardio> cardioList = new ArrayList<Cardio>();
    private ArrayList<Cooldown> cooldownList = new ArrayList<Cooldown>();

    /**
    Print all the components array
     */
    //TODO : Change from command line
    public void print() {
        WorkoutCL w = new WorkoutCL();
        w.print(warmUpList);
        w.print(stretchList);
        w.print(exerciseList);
        w.print(cardioList);
        w.print(cooldownList);
    }

    public Workout() {
        this.workoutDateTime = new Date().toString();
    }

    public String getWorkoutDateTime() {
        return workoutDateTime;
    }

    public void setWorkoutDateTime(String workoutDateTime) {
        this.workoutDateTime = workoutDateTime;
    }

    public ArrayList<WarmUp> getWarmup() {
        return warmUpList;
    }

    public ArrayList<Stretch> getStretch() {
        return stretchList;
    }

    public ArrayList<Exercise> getExercise() {
        return exerciseList;
    }

    public ArrayList<Cardio> getCardio() {
        return cardioList;
    }

    public ArrayList<Cooldown> getCooldown() {
        return cooldownList;
    }

    public void addWarmup(WarmUp warmup) {
        warmUpList.add(warmup);
    }

    public void addStretch(Stretch stretch) {
        stretchList.add(stretch);
    }

    public void addExercise(Exercise exercise) {
        exerciseList.add(exercise);
    }

    public void addCardio(Cardio cardio) {
        cardioList.add(cardio);
    }

    public void addCooldown(Cooldown cooldow) {
        cooldownList.add(cooldow);
    }
}
