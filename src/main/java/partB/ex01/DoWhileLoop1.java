package partB.ex01;

public class DoWhileLoop1 {
    public static String doWhileLoopOne() {
        String response = "";
        int index = 0;
        int[] numbers = {43, 55, 68, 91, 105};

        do {
            response += numbers[index] + "\n";
            index++;
        } while (index < numbers.length);
        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileOne = doWhileLoopOne();
        System.out.println(outputDoWhileOne);
    }
}
