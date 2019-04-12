package WorkoutComponent;

import main.Input;

import java.sql.Time;

public class WarmUpSets extends Sets {
    private int[] reps;
    private float[] weight;
    private Time[] rest;
    public WarmUpSets() {
    }

    @Override
    public void seriesInput() {
        Input<Integer> series = new Input<>("How many warm up series : ", Integer.class);
        super.setSeries(series.getValue());
    }

    @Override
    public void repsInput() {
        reps = new int[getSeries()];
        int y;
        for (int x = 0; x < super.getSeries(); x++) {
            y = x+1;
            //TODO : Add validation
            Input<Integer> rep = new Input<>("How many reps for warm up series " + y + " : ", Integer.class);
            this.reps[x] = rep.getValue();
        }
        super.setReps(reps);
    }

    @Override
    public void weightInput() {
        weight = new float[getSeries()];
        int y;
        for (int x = 0; x < super.getSeries(); x++) {
            y = x+1;
            //TODO : Add validation
            Input<Integer> weight = new Input<>("How much weight for warm up series " + y + " : ", Integer.class);
            this.weight[x] = weight.getValue();
        }
        super.setWeight(weight);
    }

    @Override
    public void restInput() {
        rest = new Time[getSeries()];
        int y;
        for (int x = 0; x < super.getSeries() - 1; x++) {
            y = x+1;
            //TODO : Add validation
            Input<Integer> minutes = new Input<>("How many rest minutes for warm up series " + y + " : ", Integer.class);
            Input<Integer> seconds = new Input<>("How many rest seconds for warm up series " + y + " : ", Integer.class);
            this.rest[x] = new Time(0, minutes.getValue(), seconds.getValue());
        }
        super.setRest(rest);
    }
}
