package WorkoutComponent;

public class Exercise extends WorkoutComponent {
    private int series;
    private Sets[] sets;
    private Sets warmUpSets;

    public Exercise() {
        super.setType("Exercise");
    }

    public Exercise(int series, Sets[] sets, Sets warmUpSets) {
        this.series = series;
        this.sets = sets;
        this.warmUpSets = warmUpSets;
    }

    public Exercise(String name, int series, Sets[] sets, Sets warmUpSets) {
        //Type is set as default
        super(name, "Exercise");
        this.series = series;
        this.sets = sets;
        this.warmUpSets = warmUpSets;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Sets[] getSets() {
        return sets;
    }

    public void setSets(Sets[] sets) {
        this.sets = sets;
    }

    public Sets getWarmUpSets() {
        return warmUpSets;
    }

    public void setWarmUpSets(Sets warmUpSets) {
        this.warmUpSets = warmUpSets;
    }
}
