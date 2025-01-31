package partB.ex02;

public class WhileLoop1 {
    public static String whileLoopOne() {
        StringBuilder response = new StringBuilder();
        int num = 1;

        while (num <= 1000) { if (num % 2 == 0) {
                response.append(num).append(" is even\n");
            }
            num++;
        }
        return response.toString();
    }

    public static void main(String[] args) {
        String outputWhileLoopOne = whileLoopOne();
        System.out.println(outputWhileLoopOne);
    }
}
