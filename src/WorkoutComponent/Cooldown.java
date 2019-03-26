package WorkoutComponent;

import java.sql.Time;

public class Cooldown extends WorkoutComponent{
    private Time time;

    public Cooldown() {
    }

    public Cooldown(String name, Time time) {
        super(name, "Cooldown");
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
