package main;

public class Options {
    private String[] options;

    public Options(String[] options) {
        this.options = options;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void optionsPrinter() {
        System.out.println();
        System.out.println("Select an option");
        int x = 1;
        for (String option : options)
            System.out.println(x++ + " - " + option);
    }
}
