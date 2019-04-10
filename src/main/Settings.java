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
            String userInput = Input.input("Choose an option", String.class);

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
                    again = true;
            }
        }

        System.out.println();
        System.out.println("Enter the weight of the plate in " + unit);
        System.out.println("Enter '0' to change unit");

        Double weight = 0d;
        do {
            weight = Input.input("Weight : ", Double.class);
            if (weight == 0)
                if (unit.equals("Kg"))
                    unit = "lbs";
                if (unit.equals("lbs"))
                    unit = "Kg";
        } while (weight != 0);


        System.out.println();
        System.out.println("Enter the name/brand of the plate");
        String name = Input.input("Name/Brand : ", String.class);


        Equipement plate = new Plate(unit, weight, name);

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
