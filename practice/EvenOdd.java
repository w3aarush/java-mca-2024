import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = in.nextInt();
        int remainder = number % 2;
        
        switch(remainder) {
            case 0:
            System.out.println("Even");
            break;
            case 1:
            System.out.println("Odd");
            break;
        }
        
        in.close();
    }
}
