package WorkoutComponent;

import main.Input;

import java.sql.Time;

/*
Parent class for the different workout types
Each different exercises are filed in a type and added into an array for their type
This handles individual workout exercises
 */
public abstract class WorkoutComponent {
    private String name;
    private String type;

    WorkoutComponent(){

    }

    WorkoutComponent(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }


    protected String nameInput(){
        Input<String> name = new Input<>("Name of the " + type.toLowerCase() + " : ", String.class);
        return name.getValue();
    }

    protected Time timeInput(){
        Input<Integer> minutes = new Input<>("For how much time (minutes) : ", Integer.class);
        Input<Integer> seconds = new Input<>("For how much time (seconds) : ", Integer.class);
        return new Time(0, minutes.getValue(), seconds.getValue());
    }




    //Insert component into database
    public void DBinsert(){
        //TODO
    }

    //Delete component from database
    public void DBdelete(){
        //TODO
    }

    //Update component from database
    public void DBupdate(){
        //TODO
    }

    //Select component from database
    public void DBselect(){
        //TODO
    }
}
