package partA.ex02;

import java.util.Scanner;

public class SumOfNums {
    public static String sum(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        do {
            System.out.print("Enter integer " + (count + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
            count++;
        } while (count < 10);


        String response ="";

        return response;
    }
    public static void main(String args[]) {
        String outputSum = sum();
        System.out.println(outputSum);
    }
}
