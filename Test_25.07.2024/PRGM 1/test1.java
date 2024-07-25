import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(cheeck(str));
    }
    public static int cheeck(String input1) {
        if (input1 == null || input1.isEmpty()) {
            return 0;
        }
        List<Integer> num = new ArrayList<>();
        List<Character> op = new ArrayList<>();
        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.add(Character.getNumericValue(ch));
            } else if (isOperator(ch)) {
                op.add(ch);
            }
        }
        int result = num.get(0);
        for (int i = 0; i < op.size(); i++) {
            char op1 = op.get(i);
            int nextNumber = num.get(i + 1);
            switch (op1) {
                case '+':
                    result += nextNumber;
                    break;
                case '-':
                    result -= nextNumber;
                    break;
                case '*':
                    result *= nextNumber;
                    break;
                case '/':
                        result /= nextNumber;
                    break;
            }
        }

        return result;
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
