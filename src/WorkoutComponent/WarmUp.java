package WorkoutComponent;

import main.Input;

import java.sql.Time;

public class WarmUp extends WorkoutComponent {
    private Time time;

    public WarmUp() {
        super.setType("WarmUp");
        nameInput();
        timeInput();
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * Set the name via user input
     */
    private void nameInput() {
        Input<String> name = new Input<>("Name of the warm up : ", String.class);
        super.setName(name.getValue());
    }

    /**
     * Set the time via user input
     */
    private void timeInput() {
        Input<Integer> minutes = new Input<>("For how much time (minutes) : ", Integer.class);
        Input<Integer> seconds = new Input<>("For how much time (seconds) : ", Integer.class);
        this.time = new Time(0, minutes.getValue(), seconds.getValue());
    }
}
