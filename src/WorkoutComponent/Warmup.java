package WorkoutComponent;

import java.sql.Time;

public class Warmup extends WorkoutComponent {
    private Time time;

    public Warmup(){

    }

    public Warmup(String name, Time time) {
        super(name, "Warmup");
        this.time = time;
    }
}
