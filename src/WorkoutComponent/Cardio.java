package WorkoutComponent;

import main.Input;

import java.sql.Time;

public class Cardio extends WorkoutComponent {
    private Time time;
    private int calories;
    private float distance;
    private String distanceUnit;

    public Cardio() {
        super.setType("Cardio");
        super.nameInput();
        this.time = timeInput();
    }


    private void caloriesInput(){
        Input<Integer> calories = new Input<>("How many calories burned : ", Integer.class);
        this.calories = calories.getValue();
    }

    private void distanceInput(){
        Input<Float> distance = new Input<>("Distance traveled : ", Float.class);
        this.distance = distance.getValue();
    }

    private void distanceUnitInput(){
        Input<String> distanceUnit = new Input<>("Distance unit (km/m) : ", String.class);
        this.distanceUnit = distanceUnit.getValue();
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

    public String isDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }
}
