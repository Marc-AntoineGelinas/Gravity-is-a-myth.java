package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input<T> {
    private Scanner scanner = new Scanner(System.in);
    private T value;

    public Input(String message, Class<T> c) {
        do {
            System.out.println(message);
            value = inputScanner(c);
        } while (value == null);
        setValue(value);
    }

    private T inputScanner(Class<T> c) throws InputMismatchException, NullPointerException {

        try {
            if (c == Integer.class) {
                T value = c.cast(scanner.nextInt());
                if (validateUserInput(value))
                    return value;
            }
            if (c == String.class) {
                T value = c.cast(scanner.nextLine());
                if (validateUserInput(value))
                    return value;
            }
            if (c == Double.class) {
                T value = c.cast(scanner.nextDouble());
                if (validateUserInput(value))
                    return value;
            }
            if (c == Float.class) {
                T value = c.cast(scanner.nextFloat());
                if (validateUserInput(value))
                    return value;
            }
        } catch (InputMismatchException e) {
            scanner.reset();
            System.out.println("Wrong value type.");
            return null;
        } catch (NullPointerException e) {
            scanner.reset();
            System.out.println("Value cannot be empty.");
            return null;
        }
        return null;
    }

    private static <T> boolean validateUserInput(T value) throws InputMismatchException, NullPointerException {
        if (value == null || value.toString().trim().equals("")) {
            throw new NullPointerException();
        }
        return true;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}