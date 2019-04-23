package WorkoutComponent;


import java.sql.Time;

public class Sets {
    private int reps;
    private float weight;
    private Time rest;

    public Sets() {
    }

    public Sets(int reps, float weight, Time rest) {
        this.reps = reps;
        this.weight = weight;
        this.rest = rest;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Time getRest() {
        return rest;
    }

    public void setRest(Time rest) {
        this.rest = rest;
    }
}
