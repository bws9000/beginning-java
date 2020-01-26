package com.command;

import java.util.Scanner;

/**
 * command line example
 * @author burtsnyder
 */
public class CommandLine {

    String input;

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        input = in.nextLine();
        while (!input.equals("hello")) {
            System.out.print("You didn't type hello, try again: ");
            input = in.nextLine();
        }
        System.out.println("The End.");
    }

}
