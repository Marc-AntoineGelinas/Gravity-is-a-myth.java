package main;

public class Plate implements Validable {
    private String unit;
    private double weight;

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getUnit() {
        return unit;
    }

    public double getWeight() {
        return weight;
    }

    double validateWeight(String weight){
        try {
            return Double.parseDouble(weight);
        } catch (NumberFormatException e) {
            // TODO : Put a better error handling
            System.out.println(e);
            throw e;
        }
    }

    @Override
    public boolean isValid() {
        if (!this.unit.equals("lbs") && !this.unit.equals("kg")){
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
