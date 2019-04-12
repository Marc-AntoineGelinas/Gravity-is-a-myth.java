package WorkoutComponent;

import main.Input;

import java.sql.Time;

public class Cooldown extends WorkoutComponent{
    private Time time;

    public Cooldown() {
        super.setType("Cooldown");
        nameInput();
        timeInput();
    }

    private void nameInput(){
        Input<String> name = new Input<>("Name of the cooldown : ", String.class);
        super.setName(name.getValue());
    }

    private void timeInput(){
        Input<Integer> minutes = new Input<>("For how much time (minutes) : ", Integer.class);
        Input<Integer> seconds = new Input<>("For how much time (seconds) : ", Integer.class);
        this.time = new Time(0, minutes.getValue(), seconds.getValue());
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
