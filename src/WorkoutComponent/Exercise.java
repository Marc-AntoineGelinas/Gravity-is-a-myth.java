package WorkoutComponent;

import java.util.LinkedList;
import java.util.List;

public class Exercise extends WorkoutComponent {
    private int setsCount;
    private List<Sets> sets;
    //TODO : warm up sets
    //private Sets warmUpSets;

    public Exercise() {
        super.setType("Exercise");
        sets = new LinkedList<Sets>();
    }

    public Exercise(int setsCount, List<Sets> sets, Sets warmUpSets) {
        this.setsCount = setsCount;
        this.sets = sets;
        //this.warmUpSets = warmUpSets;
    }

    public Exercise(String name, int setsCount, List<Sets> sets, Sets warmUpSets) {
        //Type is set as default
        super(name, "Exercise");
        this.setsCount = setsCount;
        this.sets = sets;
        //this.warmUpSets = warmUpSets;
    }

    public int getSetsCount() {
        return setsCount;
    }

    public void setSetsCount(int setsCount) {
        this.setsCount = setsCount;
    }

    public List<Sets> getSets() {
        return sets;
    }

    public void setSets(List<Sets> sets) {
        this.sets = sets;
    }

    public void addSets(Sets s){
        this.sets.add(s);
    }

    public void removeSets(Sets s){
        this.sets.remove(s);
    }

//    public Sets getWarmUpSets() {
//        return warmUpSets;
//    }
//
//    public void setWarmUpSets(Sets warmUpSets) {
//        this.warmUpSets = warmUpSets;
//    }
}
