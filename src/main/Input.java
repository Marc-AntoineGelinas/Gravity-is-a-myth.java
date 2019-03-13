package main;

import java.util.Scanner;

class Input {
    private final static Scanner scanner = new Scanner(System.in);
    static <T> T input(String message, Class<T> c) throws Exception{
        System.out.println(message);
        try {
            if(c == Integer.class)
                return c.cast(scanner.nextInt());
            if(c == String.class)
                return c.cast(scanner.nextLine());
            if(c == Double.class)
                return c.cast(scanner.nextDouble());
            if(c == Float.class)
                return c.cast(scanner.nextFloat());
        } catch (Exception e) {
            throw new Exception(e);
        }
        return null;
    }
}