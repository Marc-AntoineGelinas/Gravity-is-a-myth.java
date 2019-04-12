package WorkoutComponent;

import main.Input;

import java.sql.Time;

public class Sets {
    private int series;
    private int[] reps;
    private float[] weight;
    private Time[] rest;

    public Sets() {
        seriesInput();
        repsInput();
        weightInput();
        restInput();
    }

    public void seriesInput() {
        Input<Integer> series = new Input<>("How many series : ", Integer.class);
        this.series = series.getValue();
    }

    public void repsInput(){
        reps = new int[series];
        int y;
        for (int x = 0; x < series; x++) {
            y = x+1;
            //TODO : Add validation
            Input<Integer> rep = new Input<>("How many reps for series " + y + " : ", Integer.class);
            this.reps[x] = rep.getValue();
        }
    }

    public void weightInput(){
        weight = new float[series];
        int y;
        for (int x = 0; x < series; x++) {
            y = x+1;
            //TODO : Add validation
            Input<Integer> weight = new Input<>("How much weight for series " + y + " : ", Integer.class);
            this.weight[x] = weight.getValue();
        }
    }

    public void restInput(){
        rest = new Time[series];
        int y;
        for (int x = 0; x < series - 1; x++) {
             y = x+1;
            //TODO : Add validation
            Input<Integer> minutes = new Input<>("How many rest minutes for series " + y + " : ", Integer.class);
            Input<Integer> seconds = new Input<>("How many rest seconds for series " + y + " : ", Integer.class);
            this.rest[x] = new Time(0, minutes.getValue(), seconds.getValue());
        }
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int[] getReps() {
        return reps;
    }

    public void setReps(int[] reps) {
        this.reps = reps;
    }

    public float[] getWeight() {
        return weight;
    }

    public void setWeight(float[] weight) {
        this.weight = weight;
    }

    public Time[] getRest() {
        return rest;
    }

    public void setRest(Time[] rest) {
        this.rest = rest;
    }
}
