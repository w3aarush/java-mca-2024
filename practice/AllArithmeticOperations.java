import java.util.Scanner;
public class AllArithmeticOperations {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your arithmetic operator:");
        String op = in.next();
        System.out.println("Enter any two numbers:");
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();    //Closing in to prevent resource leak

        switch(op) {
            case "+":
            System.out.println("Sum : "+(x+y));
            break;

            case "-":
            System.out.println("Subtract : "+(x-y));
            break;

            case "*":
            System.out.println("Multiply : "+(x*y));
            break;

            case "/":
            System.out.println("Divide : "+(x/y));
            break;

            case "%":
            System.out.println("Modulus : "+(x%y));
            break;

            default:
            System.out.println("Invalid Operator");
            break;
        }
    }
}
