package WorkoutComponent;

import main.Input;

import java.sql.Time;

public class WarmUp extends WorkoutComponent {
    private Time time;

    public WarmUp() {
        super.setType("Warm up");
        super.nameInput();
        this.time = super.timeInput();
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
