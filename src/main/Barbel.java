package main;

public class Barbel extends Equipement {
    public Barbel(String unit, Double weight, String name) {
        super(unit, weight, name);
    }

    @Override
    public String getUnit() {
        return super.getUnit();
    }

    @Override
    public void setUnit(String unit) {
        super.setUnit(unit);
    }

    @Override
    public Double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(Double weight) {
        super.setWeight(weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public boolean isValid() {
        return super.isValid();
    }
}
