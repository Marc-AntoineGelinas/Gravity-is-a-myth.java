package main;

import java.util.Scanner;

class Input {
    final private static Scanner scan = new Scanner(System.in);
    static String input(String message) {
        System.out.println(message);
        return scan.nextLine();
    }
}