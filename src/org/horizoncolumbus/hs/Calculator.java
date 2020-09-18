package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	// write your code
        System.out.println("CALCULATOR;use these inputs add, sub, mul, div");
        System.out.print("WHAT DO YOU WANT TO DO?: ");
        Scanner input = new Scanner(System.in);
        String question = input.next();
        switch (question) {
            case "add", "Add", "ADD" -> {
                System.out.print("number 1: ");
                Scanner input2 = new Scanner(System.in);
                int number1 = input2.nextInt();
                System.out.print("number 2: ");
                int number2 = input2.nextInt();
                System.out.println(number1 + number2);
            }
            case "sub", "Sub", "SUB" -> {
                System.out.print("number 1: ");
                Scanner sub = new Scanner(System.in);
                int n1 = sub.nextInt();
                System.out.print("number 2: ");
                int n2 = sub.nextInt();
                System.out.println(n1 - n2);
            }
            case "mul", "Mul", "MUL" -> {
                System.out.print("number 1: ");
                Scanner sub1 = new Scanner(System.in);
                int n11 = sub1.nextInt();
                System.out.print("number 2: ");
                int n21 = sub1.nextInt();
                System.out.println(n11 * n21);
            }
            case "div", "Div", "DIV" -> {
                System.out.print("number 1: ");
                Scanner sub2 = new Scanner(System.in);
                int n12 = sub2.nextInt();
                System.out.print("number 2: ");
                int n22 = sub2.nextInt();
                System.out.println(n12 / n22);
            }
            default -> System.out.println("invalid please try again");
        }
        input.close();

    }
}
