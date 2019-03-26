package WorkoutComponent;

/*
Parent class for the different workout types
Each different exercises are filed in a type and added into an array for their type
This handles individual workout exercises
 */
abstract class WorkoutComponent {
    private String name;
    //TODO : Figure out how to change to to WorkoutComponent object
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

    public void setType(String type) {
        this.type = type;
    }

    public void insert(){
        //TODO
    }

    public void delete(){
        //TODO
    }

    public void update(){
        //TODO
    }

    public void select(){
        //TODO
    }
}
