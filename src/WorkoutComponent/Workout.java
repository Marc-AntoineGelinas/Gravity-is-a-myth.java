package WorkoutComponent;

import java.time.LocalDate;
import java.util.ArrayList;

public class Workout {
    private LocalDate workoutDateTime;
    private ArrayList<Warmup> warmupList;
    private ArrayList<Stretch> stretchList;
    private ArrayList<Exercise> exerciseList;
    private ArrayList<Cardio> cardioList;
    private ArrayList<Cooldown> cooldownList;


    public Workout() {
        this.workoutDateTime = LocalDate.now();
    }

    public LocalDate getWorkoutDateTime() {
        return workoutDateTime;
    }

    public void setWorkoutDateTime(LocalDate workoutDateTime) {
        this.workoutDateTime = workoutDateTime;
    }

    public ArrayList<Warmup> getWarmup() {
        return warmupList;
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

    public void addWarmup(Warmup warmup) {
        warmupList.add(warmup);
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
