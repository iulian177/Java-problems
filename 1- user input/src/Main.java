//util package, scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //import the scanner class and create an object witch we will use
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); //clears the extra remained \n from the last scanner

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);



    }
}