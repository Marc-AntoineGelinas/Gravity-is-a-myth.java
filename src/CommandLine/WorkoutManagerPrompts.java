package CommandLine;

import java.sql.Time;

/**
 * Used for command line prompts for the WorkoutManager class in Main
 */
public class WorkoutManagerPrompts {

    /**
     * Confirm if user wants to add a new workout
     * @return yes, return true. no, go back to the main menu
     */
    public boolean addWorkOutPrompt(){
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
     * @return the number associated with the component to add
     */
    public int configureWorkOutPrompt(){
        String[] opts = {"Add warmup", "Add stretch", "Add exercise", "Add cardio", "Add cooldown", "Finish workout"};
        Options options = new Options(opts);

            options.optionsPrinter();
            Input<Integer> userInput = new Input<>("Choose an option : ", Integer.class);
            return userInput.getValue();
    }

    public String componentNamePrompt(String message){
        Input<String> userInput = new Input<>(message, String.class);
        return userInput.getValue();
    }

    public Time componentTimePrompt(){
        Input<Integer> hours = new Input<>("For how many hours : ", Integer.class);
        Input<Integer> minutes = new Input<>("For how many minutes : ", Integer.class);
        Input<Integer> seconds = new Input<>("For how many seconds : ", Integer.class);

        return new Time(hours.getValue(), minutes.getValue(), seconds.getValue());
    }
}
