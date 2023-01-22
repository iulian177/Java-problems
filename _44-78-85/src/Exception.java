import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    //44 exceptions

    public void ExceptionHandling() {
    Scanner scanner = new Scanner(System.in);

        try {
        System.out.println("Enter a whole number to divide: ");
        int x = scanner.nextInt();

        System.out.println("Enter a whole number to divide by: ");
        int y = scanner.nextInt();

        int z = x/y;
        System.out.println("rezult: " +z);
    }
        catch (ArithmeticException e) {
        System.err.println("You can't divide by 0 !");
    }
        catch (InputMismatchException e) {
        System.out.println("You can input just int numbers !");
    }
        finally {
        scanner.close();
    }
}
}
