package CommandLine;

import java.util.ArrayList;

/**
 * Command line interface for items related to the class "workout"
 */
public class WorkoutCL {
    public void print(ArrayList<?> components){
        if (components != null) {
            components.forEach(workoutComponent -> System.out.println(components.toString()));
        }
    }
}
