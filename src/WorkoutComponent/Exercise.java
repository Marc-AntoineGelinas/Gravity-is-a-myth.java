package WorkoutComponent;

import main.Input;


public class Exercise extends WorkoutComponent {
    private Sets sets;
    private Sets warmUpSets;

    public Exercise() {
        super.setType("Exercise");
        nameInput();
        this.sets = new Sets();
        this.warmUpSets = new WarmUpSets();
    }

    private void nameInput() {
        Input<String> name = new Input<>("Name of the exercise : ", String.class);
        super.setName(name.getValue());
    }

    public Sets getSets() {
        return sets;
    }

    public void setSets(Sets sets) {
        this.sets = sets;
    }

    public Sets getWarmUpSets() {
        return warmUpSets;
    }

    public void setWarmUpSets(Sets warmUpSets) {
        this.warmUpSets = warmUpSets;
    }
}
