package partA.ex01;

import java.util.Scanner;

public class SquareRootWhile {
    public static String squareRoot(){
        Scanner scanner = new Scanner(System.in);
        double number = -1;
        String response = "";

        while (number < 0) {
            System.out.print("Type a non-negative integer: ");
            number = scanner.nextDouble();

            if (number < 0) {
                System.out.print("Invalid number, try again: ");
            }
        }

        return response;
    }
    public static void main(String args[]) {
        String outputSquareRoot = squareRoot();
        System.out.println(outputSquareRoot);

    }
}
