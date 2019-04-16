package WorkoutComponent;

import java.sql.Time;

public class Cooldown extends WorkoutComponent{
    private Time time;

    public Cooldown() {
        super.setType("Cooldown");
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
