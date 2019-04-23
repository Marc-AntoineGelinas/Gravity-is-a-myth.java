package WorkoutComponent;

import java.util.ArrayList;
import java.util.Date;

public class Workout {
    private String workoutDateTime;
    private ArrayList<WarmUp> warmUpList = new ArrayList<WarmUp>();
    private ArrayList<Stretch> stretchList = new ArrayList<Stretch>();
    private ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();
    private ArrayList<Cardio> cardioList = new ArrayList<Cardio>();
    private ArrayList<Cooldown> cooldownList = new ArrayList<Cooldown>();


    public void print() {
        warmUpList.forEach(warmUp -> System.out.println(warmUp.toString()));
        System.out.println();
        stretchList.forEach(warmUp -> System.out.println(warmUp.toString()));
        System.out.println();
        exerciseList.forEach(warmUp -> System.out.println(warmUp.toString()));
        System.out.println();
        cardioList.forEach(warmUp -> System.out.println(warmUp.toString()));
        System.out.println();
        cooldownList.forEach(warmUp -> System.out.println(warmUp.toString()));
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
