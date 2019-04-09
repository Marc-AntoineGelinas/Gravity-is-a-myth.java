package WorkoutComponent;

import java.sql.Time;

public class Exercise extends WorkoutComponent {
    private int warmupSetsCount;
    private int series;
    private int[] reps;
    private float[] weight;
    private Time[] rest;

    public Exercise() {
    }

    public Exercise(String name, int series, int[] reps, float[] weight, Time[] rest) {
        super(name, "Exercise");
        this.series = series;
        this.reps = reps;
        this.weight = weight;
        this.rest = rest;
    }

    public Exercise(String name, int warmupSetsCount, int series, int[] reps, float[] weight, Time[] rest) {
        super(name, "Exercise");
        this.warmupSetsCount = warmupSetsCount;
        this.series = series;
        this.reps = reps;
        this.weight = weight;
        this.rest = rest;
    }

    public int getWarmupSetsCount() {
        return warmupSetsCount;
    }

    public void setWarmupSetsCount(int warmupSetsCount) {
        this.warmupSetsCount = warmupSetsCount;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int[] getReps() {
        return reps;
    }

    public void setReps(int[] reps) {
        this.reps = reps;
    }

    public float[] getWeight() {
        return weight;
    }

    public void setWeight(float[] weight) {
        this.weight = weight;
    }

    public Time[] getRest() {
        return rest;
    }

    public void setRest(Time[] rest) {
        this.rest = rest;
    }
}
