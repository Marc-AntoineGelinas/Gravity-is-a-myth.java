package WorkoutComponent;

import java.sql.Time;

public class Cardio extends WorkoutComponent {
    private Time time;
    private int calories;
    private float distance;
    private boolean distanceUnit;

    public Cardio() {
    }

    public Cardio(String name, Time time, int calories, float distance, boolean distanceUnit) {
        super(name, "Cardio");
        this.time = time;
        this.calories = calories;
        this.distance = distance;
        this.distanceUnit = distanceUnit;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public boolean isDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(boolean distanceUnit) {
        this.distanceUnit = distanceUnit;
    }
}
