package WorkoutComponent;

import main.Input;
import main.Options;

import java.sql.Time;
import java.util.Arrays;

public class Sets {
    private int series;
    private int[] reps;
    private float[] weights;
    private Time[] rest;

    public Sets() {
        this.series = seriesInput();
        this.reps = repsInput();
        this.weights = weightInput();
        this.rest = restInput();
    }

    public int seriesInput() {
        Input<Integer> series = new Input<>("How many series : ", Integer.class);
        return series.getValue();
    }

    public int[] repsInput() {
        reps = new int[series];
        boolean sameValue = sameValues("Same reps for every series? : ");
        if (sameValue) {
            Input<Integer> rep = new Input<>("How many reps for every series : ", Integer.class);
            Arrays.fill(reps, rep.getValue());
        } else {
            int y;
            for (int x = 0; x < series; x++) {
                y = x + 1;
                //TODO : Add validation
                Input<Integer> rep = new Input<>("How many reps for series " + y + " : ", Integer.class);
                reps[x] = rep.getValue();
            }
        }
        return reps;
    }


    public float[] weightInput() {
        weights = new float[series];
        boolean sameValues = sameValues("Same weights for every series? : ");

        if (sameValues) {
            Input<Integer> weight = new Input<>("How much weights for every series : ", Integer.class);
            Arrays.fill(weights, weight.getValue());
        } else {
            int y;
            for (int x = 0; x < series; x++) {
                y = x + 1;
                //TODO : Add validation
                Input<Integer> weight = new Input<>("How much weights for series " + y + " : ", Integer.class);
                weights[x] = weight.getValue();
            }
        }
        return weights;
    }

    public Time[] restInput() {
        rest = new Time[series - 1];
        boolean sameValues = sameValues("Same rest for every series? : ");
        if (sameValues) {
            Input<Integer> minutes = new Input<>("How many minutes for every series  : ", Integer.class);
            Input<Integer> seconds = new Input<>("How many seconds for every series  : ", Integer.class);
            Arrays.fill(rest, new Time(0, minutes.getValue(), seconds.getValue()));
        } else {
            int y;
            for (int x = 0; x < series; x++) {
                y = x + 1;
                //TODO : Add validation
                Input<Integer> minutes = new Input<>("How many rest minutes for series " + y + " : ", Integer.class);
                Input<Integer> seconds = new Input<>("How many rest seconds for series " + y + " : ", Integer.class);
                rest[x] = new Time(0, minutes.getValue(), seconds.getValue());
            }
        }
        return rest;
    }

    protected boolean sameValues(String message) {
        String[] opts = {"Yes", "No"};
        Options options = new Options(opts);
        boolean again = true;
        boolean same = true;

        while (again) {
            options.optionsPrinter();
            Input<String> userInput = new Input<>(message, String.class);

            //Redirect to a feature based on the user input
            switch (userInput.getValue()) {
                case "1":
                    same = true;
                    again = false;
                    break;
                case "2":
                    same = false;
                    again = false;
                    break;
                default:
                    System.out.println("Invalid option. Choose a valid option please.");
                    again = true;
            }
        }
        return same;
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

    public float[] getWeights() {
        return weights;
    }

    public void setWeights(float[] weights) {
        this.weights = weights;
    }

    public Time[] getRest() {
        return rest;
    }

    public void setRest(Time[] rest) {
        this.rest = rest;
    }
}
