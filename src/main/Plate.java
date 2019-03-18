package main;


public class Plate implements Validable {
    private String unit;
    private Double weight;

    Plate(String unit, double weight) {
        this.unit = unit;
        this.weight = weight;
    }

    void setUnit(String unit) {
        this.unit = unit;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    public String getUnit() {
        return unit;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isValid() {
        if (!this.unit.equals("lbs") && !this.unit.equals("Kg")){
            System.out.println("Unit must be a valid type");
            return false;
        }
        else if (this.weight <= 0) {
            System.out.println("Weight must be positive and more than 0");
            return false;
        }
        else
            return true;
    }
}
