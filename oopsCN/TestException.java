import java.util.Scanner;

class SmallNumberException extends Exception {
    SmallNumberException(String msg) {
        super(msg);
    }
}

public class TestException {

    static void subtract(int a, int b) throws SmallNumberException {
        if (a < b) {
            throw new SmallNumberException("Cannot subtract bigger number from smaller number");
        } else {
            System.out.println("Result = " + (a - b));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            subtract(a, b);

        } catch (SmallNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}