package partB.ex01;

public class DoWhileLoop2 {
    public static String doWhileLoopTwo() {
        String response = "";
        int number = 1;

        do {
                response += number + " ";
                number += 2;
        } while (number <= 19);

        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileTwo = doWhileLoopTwo();
        System.out.println(outputDoWhileTwo);
    }
}
