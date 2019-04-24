package CommandLine;

import WorkoutComponent.Sets;

import java.sql.Time;

/**
 * Used for command line prompts for the WorkoutManager class in Main
 */
public class WorkoutManagerPrompts {

    /**
     * Confirm if user wants to add a new workout
     *
     * @return yes, return true. no, go back to the main menu
     */
    public boolean addWorkOutPrompt() {
        boolean again = true;
        while (again) {
            again = false;
            System.out.println();
            System.out.println("Create new workout?");
            Input<String> userInput = new Input<>("yes/no", String.class);

            //TODO : Add validation
            if (userInput.getValue().equals("yes")) {
                //If prompt is positive, create a new workout
                return true;
            } else if (userInput.getValue().equals("no")) {
                //If prompt is negative, return to main menu
                Menus menus = new Menus();
                menus.mainMenu();
            } else {
                //If user input is invalid, loop this prompt
                System.out.println("Invalid option. Choose an option again please");
                again = true;
            }
        }
        //If the loop failed and exited without a proper handling
        System.out.println("Something went wrong. WorkoutManagerPrompts.addWorkOutPrompt");
        return false;
    }

    /**
     * User input for which component to add to the workout
     *
     * @return the number associated with the component to add
     */
    public int configureWorkOutPrompt() {
        String[] opts = {"View Options", "Add warmup", "Add stretch", "Add exercise", "Add cardio", "Add cooldown", "Finish workout"};
        Options options = new Options(opts);

        options.optionsPrinter();
        Input<Integer> name = new Input<>("Choose an option : ", Integer.class);
        return name.getValue();
    }

    /**
     * User input for the name of the component
     *
     * @param message Message displayed to the user for the input
     * @return the name of the component
     */
    public String componentNamePrompt(String message) {
        Input<String> userInput = new Input<>(message, String.class);
        return userInput.getValue();
    }

    /**
     * User input for the time of a component
     *
     * @return the time spent for the component
     */
    public Time componentTimePrompt() {
        Input<Integer> hours = new Input<>("For how many hours : ", Integer.class);
        Input<Integer> minutes = new Input<>("For how many minutes : ", Integer.class);
        Input<Integer> seconds = new Input<>("For how many seconds : ", Integer.class);

        return new Time(hours.getValue(), minutes.getValue(), seconds.getValue());
    }

    public Time componentRestPrompt() {
        Input<Integer> minutes = new Input<>("How many minutes of rest : ", Integer.class);
        Input<Integer> seconds = new Input<>("How many seconds of rest : ", Integer.class);

        return new Time(0, minutes.getValue(), seconds.getValue());
    }

    /**
     * User input for the number of reps of a component
     *
     * @return the numbers of repetitions for a component
     */
    public int componentRepsPrompt() {
        Input<Integer> reps = new Input<>("For how many repetitions : ", Integer.class);
        return reps.getValue();
    }

    public int componentCaloriesPrompt() {
        Input<Integer> calories = new Input<>("How many calories spent : ", Integer.class);
        return calories.getValue();
    }

    public float componentDistancePrompt() {
        Input<Float> distance = new Input<>("Distance traveled : ", Float.class);
        return distance.getValue();
    }

    public String componentDistanceUnitPrompt() {
        //TODO : Add validation
        //TODO : Add as a setting
        Input<String> distanceUnit = new Input<>("Distance unit (km/miles) : ", String.class);
        return distanceUnit.getValue();
    }

    public int componentSeriesCountPrompt() {
        //TODO : Add validation
        Input<Integer> seriesCount = new Input<>("How many sets? : ", Integer.class);
        return seriesCount.getValue();
    }

    public Sets componentAddSet(int currentSet, boolean lastSet) {
        Sets s = new Sets();

        System.out.println("For set " + currentSet);

        s.setReps(componentRepsPrompt());
        s.setWeight(componentWeightPrompt());
        if (!lastSet)
            s.setRest(componentRestPrompt());

        return s;
    }

    public float componentWeightPrompt() {
        Input<Float> weight = new Input<>("How much weight? : ", Float.class);
        return weight.getValue();
    }
}
