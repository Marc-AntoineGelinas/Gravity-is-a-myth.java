package WorkoutComponent;

import java.sql.Time;

public class Cooldown extends WorkoutComponent{
    private Time time;

    public Cooldown() {
        super.setType("Cooldown");
    }

    public Cooldown(String name, Time time) {
        super(name, "Cooldown");
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %tT",super.getType(), super.getName(), getTime());
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
