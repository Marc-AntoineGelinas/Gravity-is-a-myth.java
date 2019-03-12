package main;

import java.util.Scanner;

class Input {
    String input(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        String userInput = scan.nextLine();
        scan.close();
        return userInput;
    }
}
