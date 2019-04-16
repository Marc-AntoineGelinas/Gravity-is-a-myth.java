package WorkoutComponent;

import main.Input;

import java.sql.Time;
import java.util.Arrays;

public class WarmUpSets extends Sets {

    public WarmUpSets() {
        super.setSeries(seriesInput());
        super.setReps(repsInput());
        super.setWeights(weightInput());
        super.setRest(restInput());
    }

    @Override
    public int seriesInput() {
        Input<Integer> series = new Input<>("How many warm up series : ", Integer.class);
        return series.getValue();
    }

    @Override
    public int[] repsInput() {
        int[] reps = new int[getSeries()];
        boolean sameValues = super.sameValues("Same reps for every values? : ");

        if (sameValues) {
            Input<Integer> rep = new Input<>("How many reps for every warm up series  : ", Integer.class);
            Arrays.fill(reps, rep.getValue());
        }
        int y;
        for (int x = 0; x < super.getSeries(); x++) {
            y = x + 1;
            //TODO : Add validation
            Input<Integer> rep = new Input<>("How many reps for warm up series " + y + " : ", Integer.class);
            reps[x] = rep.getValue();
        }
        return reps;
    }

    @Override
    public float[] weightInput() {
        float[] weights = new float[getSeries()];
        boolean sameValues = super.sameValues("Same weights for every warm up series ? : ");

        if (sameValues) {
            Input<Integer> weight = new Input<>("How much weights for every warm up series  : ", Integer.class);
            Arrays.fill(weights, weight.getValue());
        } else {
            int y;
            for (int x = 0; x < super.getSeries(); x++) {
                y = x + 1;
                //TODO : Add validation
                Input<Integer> weight = new Input<>("How much weights for warm up series " + y + " : ", Integer.class);
                weights[x] = weight.getValue();
            }
        }
        return weights;
    }

    @Override
    public Time[] restInput() {
        Time[] rest = new Time[getSeries()];
        boolean sameValues = super.sameValues("Same rest for every warm up series ? : ");

        if (sameValues) {
            Input<Integer> minutes = new Input<>("How many rest minutes for warm up series : ", Integer.class);
            Input<Integer> seconds = new Input<>("How many rest seconds for warm up series : ", Integer.class);
            Arrays.fill(rest, new Time(0, minutes.getValue(), seconds.getValue()));
        } else {
            int y;
            for (int x = 0; x < super.getSeries() - 1; x++) {
                y = x + 1;
                //TODO : Add validation
                Input<Integer> minutes = new Input<>("How many rest minutes for warm up series " + y + " : ", Integer.class);
                Input<Integer> seconds = new Input<>("How many rest seconds for warm up series " + y + " : ", Integer.class);
                rest[x] = new Time(0, minutes.getValue(), seconds.getValue());
            }
        }
        return rest;
    }
}
