package main;

import java.util.InputMismatchException;
import java.util.Scanner;

class Input {
    private final static Scanner scanner = new Scanner(System.in);

    static <T> T input(String message, Class<T> c) throws InputMismatchException, NullPointerException {
        System.out.println(message);
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
        } catch (NullPointerException e){
            scanner.reset();
            System.out.println("Value cannot be empty.");
        }
        return null;
    }

    private static <T> boolean validateUserInput(T value) throws InputMismatchException, NullPointerException{
        if (value == null || value.toString().trim().equals("")){
            throw new NullPointerException();
        }
        return true;
    }
}