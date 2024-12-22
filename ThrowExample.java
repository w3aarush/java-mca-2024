import java.util.Scanner;
class ThrowExample {
    public void checkNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        System.out.println("Number is valid: " + number);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ThrowExample example = new ThrowExample();
        try {
            System.out.println("Enter a value to check:");
            int value = in.nextInt();
            example.checkNumber(value); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
