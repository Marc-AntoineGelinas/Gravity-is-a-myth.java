package Tests;

import WorkoutComponent.Workout;
import WorkoutComponent.*;

import java.sql.Time;

public class TestComponents {
    public void addTestComponents(Workout workout){
        WarmUp warmup1 = new WarmUp("Bike", new Time(0,15,30));
        WarmUp warmup2 = new WarmUp("Threadmill", new Time(0,10,0));
        workout.addWarmup(warmup1);
        workout.addWarmup(warmup2);

        Stretch stretch1 = new Stretch("Balistic", new Time(0,5,0), 10);
        Stretch stretch2 = new Stretch("Calves stretch", new Time(0,2,0), 5);
        workout.addStretch(stretch1);
        workout.addStretch(stretch2);

        Cardio cardio1 = new Cardio("Bike", new Time(1,30,45), 1560, 18.56f, "km");
        Cardio cardio2 = new Cardio("Rowing machine", new Time(0,15,15), 600, 5f, "km");
        workout.addCardio(cardio1);
        workout.addCardio(cardio2);

        Cooldown cooldown1 = new Cooldown("Tv", new Time(4,22,56));
        workout.addCooldown(cooldown1);

    }
}
