package WorkoutComponent;

import java.sql.Time;

public class Cardio extends WorkoutComponent {
    private Time time;
    private int calories;
    private float distance;
    //TODO : Add as a setting
    private String distanceUnit;

    public Cardio() {
        super.setType("Cardio");
    }

    public Cardio(String name, Time time, int calories, float distance, String distanceUnit) {
        super(name, "Cardio");
        this.time = time;
        this.calories = calories;
        this.distance = distance;
        this.distanceUnit = distanceUnit;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %tT - %d calories - %.2f%s",super.getType(), super.getName(), getTime(), getCalories(), getDistance(),getDistanceUnit());
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

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }
}
