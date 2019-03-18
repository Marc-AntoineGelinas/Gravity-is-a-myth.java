package main;

class Settings {


    void addPlate() throws Exception {
        System.out.println();
        System.out.println("1 - Kg plate");
        System.out.println("2 - lbs plate");
        System.out.println("3 - exit");

        String userInput = Input.input("Choose an option", String.class);

        String unit = "";

        switch (userInput) {
            case "1":
                unit = "Kg";
                break;
            case "2":
                unit = "lbs";
                break;
            case "3":
                Menus menus = new Menus();
                menus.settingsMenu();
                break;
            default:
                System.out.println("Invalid option. Choose an option again please.");
                addPlate();
        }

        System.out.println();
        System.out.println("Enter the weight of the plate in " + unit);
        System.out.println("Enter 'unit' to change unit");


       Double weight = Input.input("Weight : ", Double.class);
       if (weight == null)
           addPlate();



        Plate plate = new Plate(unit, weight);

        plate.setUnit(unit);
        plate.setWeight(weight);
        // TODO : Add plate to database
        System.out.print("Plate added");
        Menus menus = new Menus();
        menus.settingsMenu();
    }
}
