package WorkoutComponent;


import java.sql.Time;

public class WarmUp extends WorkoutComponent {
    private Time time;

    public WarmUp() {
        super.setType("Warm up");
    }

    public WarmUp(String name, Time time) {
        super(name, "Warm up");
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
