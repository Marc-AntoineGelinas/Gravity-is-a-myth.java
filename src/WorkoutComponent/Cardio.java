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
        nameInput();
        timeInput();
    }

    private void nameInput(){
        Input<String> name = new Input<>("Name of the cardio : ", String.class);
        super.setName(name.getValue());
    }

    private void timeInput(){
        Input<Integer> minutes = new Input<>("For how much time (minutes) : ", Integer.class);
        Input<Integer> seconds = new Input<>("For how much time (seconds) : ", Integer.class);
        this.time = new Time(0, minutes.getValue(), seconds.getValue());
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
