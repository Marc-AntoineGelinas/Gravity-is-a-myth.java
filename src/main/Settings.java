package main;

import Equipement.Plate;
import Equipement.Equipement;

class Settings {

    void addPlate() {
        String[] opts = {"Kg plate", "lbs plate", "Exit"};
        Options options = new Options(opts);
        boolean again = true;
        String unit = "";

        while (again) {
            again = false;
            options.optionsPrinter();
            Input<String> userInput = new Input<>("Choose an option", String.class);

            switch (userInput.getValue()) {
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
                    again = true;
            }
        }

        System.out.println();
        System.out.println("Enter the weight of the plate in " + unit);
        System.out.println("Enter '0' to change unit");

        Input<Double> weight;
        do {
            weight = new Input<>("Weight : ", Double.class);
            if (weight.getValue() == 0)
                if (unit.equals("Kg"))
                    unit = "lbs";
                if (unit.equals("lbs"))
                    unit = "Kg";
        } while (weight.getValue() != 0);


        System.out.println();
        System.out.println("Enter the name/brand of the plate");
        Input<String> name = new Input<>("Name/Brand : ", String.class);


        Equipement plate = new Plate(unit, weight.getValue(), name.getValue());

        // TODO : Add plate to database
        System.out.print("Plate added");
        Menus menus = new Menus();
        menus.settingsMenu();
    }

    void deletePlate() {
        //TODO
    }

    void modifyPlate() {
        //TODO
    }
}
