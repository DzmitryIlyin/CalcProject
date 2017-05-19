import java.util.Scanner;

public class Calculator {
    private static final char PLUS_OP = '+';
    public static final char MINUS_OP = '-';
    public static final char MULT_OP = '*';
    public static final char DIV_OP = '/';

    public static void main(String[] args) {
        double res=0;
        Double x2, y2;
        char s;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please input 1st operand");
        x2 = scanner.nextDouble();
        System.out.println("Please input 2nd operand");
        y2 = scanner.nextDouble();
        System.out.println("Please input Operator");
        s = scanner.next().charAt(0);



        if (s == PLUS_OP || s == MINUS_OP || s == MULT_OP || s == DIV_OP) {
            switch (s) {
                case PLUS_OP:
                    res = Operation.add(x2, y2);
                    break;
                case MINUS_OP:
                    res = Operation.subst(x2, y2);
                    break;
                case MULT_OP:
                    res = Operation.mult(x2, y2);
                    break;
                case DIV_OP:
                    res = Operation.div(x2, y2);
                    break;
            }
            System.out.println("Result: " + res);

        } else {
            System.out.println("Wrong operator!");
        }
    }
}