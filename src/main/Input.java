package main;

import java.util.InputMismatchException;
import java.util.Scanner;

class Input {
    private final static Scanner scanner = new Scanner(System.in);


    static <T> T input(String message, Class<T> c) {
        T value;
        do {
            System.out.println(message);
            value = inputScanner(c);
        } while (value == null);
        return value;
    }

    private static <T> T inputScanner(Class<T> c) throws InputMismatchException, NullPointerException {

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
}