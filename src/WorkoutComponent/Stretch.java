package WorkoutComponent;

import main.Input;

import java.sql.Time;

public class Stretch extends WorkoutComponent{
    private Time time;
    private int reps;

    public Stretch() {
        super.setType("Stretch");
        nameInput();
        timeInput();
    }

    public Stretch(String name, Time time, int reps) {
        super(name, "Stretch");
        this.time = time;
        this.reps = reps;
    }

    private void nameInput(){
        Input<String> name = new Input<>("Name of the stretch : ", String.class);
        super.setName(name.getValue());
    }

    private void timeInput(){
        Input<Integer> minutes = new Input<>("For how much time (minutes) : ", Integer.class);
        Input<Integer> seconds = new Input<>("For how much time (seconds) : ", Integer.class);
        this.time = new Time(0, minutes.getValue(), seconds.getValue());
    }

    private void repsInput(){
        Input<Integer> reps = new Input<>("How many repetitions : ", Integer.class);
        this.reps = reps.getValue();
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
