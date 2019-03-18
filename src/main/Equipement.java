package main;

public abstract class Equipement implements Validable{
    private String unit;
    private Double weight;
    private String name;

    public Equipement(String unit, Double weight, String name) {
        this.unit = unit;
        this.weight = weight;
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEquipement(){
        //TODO
    }

    public void deleteEquipement(){
        //TODO
    }

    public void modifyEquipement(){
        //TODO
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
        else if (this.name.equals("")){
            System.out.println("You must enter a name/brand for the object");
            return false;
        }
        else
            return true;
    }
}
