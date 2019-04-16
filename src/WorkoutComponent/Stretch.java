package WorkoutComponent;

import main.Input;

import java.sql.Time;

public class Stretch extends WorkoutComponent{
    private Time time;
    private int reps;

    public Stretch() {
        super.setType("Stretch");
        super.nameInput();
        this.time = super.timeInput();
        this.reps = repsInput();
    }

    public Stretch(String name, Time time, int reps) {
        super(name, "Stretch");
        this.time = time;
        this.reps = reps;
    }

    private int repsInput(){
        Input<Integer> reps = new Input<>("How many repetitions : ", Integer.class);
        return reps.getValue();
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
