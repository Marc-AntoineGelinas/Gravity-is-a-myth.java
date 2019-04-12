package WorkoutComponent;

import java.time.LocalDate;
import java.util.ArrayList;

public class Workout {
    private LocalDate workoutDateTime;
    private ArrayList<WarmUp> warmUpList = new ArrayList<WarmUp>();
    private ArrayList<Stretch> stretchList = new ArrayList<Stretch>();
    private ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();
    private ArrayList<Cardio> cardioList = new ArrayList<Cardio>();
    private ArrayList<Cooldown> cooldownList = new ArrayList<Cooldown>();


    public Workout() {
        this.workoutDateTime = LocalDate.now();
    }

    public LocalDate getWorkoutDateTime() {
        return workoutDateTime;
    }

    public void setWorkoutDateTime(LocalDate workoutDateTime) {
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
