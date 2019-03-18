package main;

import java.util.InputMismatchException;
import java.util.Scanner;

class Input {
    private final static Scanner scanner = new Scanner(System.in);

    static <T> T input(String message, Class<T> c) throws InputMismatchException {

        System.out.println(message);
        try {
            if (c == Integer.class) {
                T value = c.cast(scanner.nextInt());
                return value;
            }
            if (c == String.class){
                T value = c.cast(scanner.nextLine());
                return value;
            }
            if (c == Double.class){
                T value = c.cast(scanner.nextDouble());
                return value;
            }
            if (c == Float.class){
                T value = c.cast(scanner.nextFloat());
                return value;
            }

        } catch (InputMismatchException e) {
            scanner.reset();
            System.out.println("Wrong value type.");
        }
        return null;
    }
}