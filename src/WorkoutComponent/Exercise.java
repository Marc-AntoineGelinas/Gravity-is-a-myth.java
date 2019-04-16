package WorkoutComponent;

public class Exercise extends WorkoutComponent {
    private Sets sets;
    private Sets warmUpSets;

    public Exercise() {
        super.setType("Exercise");
        super.nameInput();
        this.sets = new Sets();
        this.warmUpSets = new WarmUpSets();
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
