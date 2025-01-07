/*
 * WAP to take a number and check the number is b/w 5000 and 10000 or not also the number is 7500, 9000, 15000 ?
 */
import java.util.Scanner;
public class ExampleNestedIf {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = in.nextInt();
        if(x>5000 && x<10000)
        {
            System.out.println("Yes, the number exists in between 5000 and 10000.");
            if(x==7500) System.out.println("Number is 7500.");
            else if(x==9000) System.out.println("Number is 9000.");
        }
        else{
            System.out.println("Number is 15000.");
            System.out.println("Number doesn't exist.");
        }

        in.close();
    }
}