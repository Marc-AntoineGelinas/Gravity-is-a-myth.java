package WorkoutComponent;

import java.sql.Time;

public class Stretch extends WorkoutComponent{
    private Time time;
    private int reps;

    public Stretch() {
    }

    public Stretch(String name, Time time, int reps) {
        super(name, "Stretch");
        this.time = time;
        this.reps = reps;
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
