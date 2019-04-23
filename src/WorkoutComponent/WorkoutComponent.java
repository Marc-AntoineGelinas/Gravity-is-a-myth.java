package WorkoutComponent;

/*
Parent class for the different workout types
Each different exercises are filed in a type and added into an array for their type
This handles individual workout exercises
 */
public abstract class WorkoutComponent {
    private String name;
    private String type;

    public WorkoutComponent() {
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


    //Insert component into database
    public void DBinsert() {
        //TODO
    }

    //Delete component from database
    public void DBdelete() {
        //TODO
    }

    //Update component from database
    public void DBupdate() {
        //TODO
    }

    //Select component from database
    public void DBselect() {
        //TODO
    }
}
