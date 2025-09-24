
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.print("Enter the first number: ");
        int userInput1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int userInput2 = input.nextInt();

        if (userInput1 == number1 && userInput2 == number2){
            System.out.println("You won 10000$");
        }
        else if (userInput1 == number2 && userInput2 == number1){
            System.out.println("You won 3000$");
        }
        else if (userInput1 == number1 || userInput1 == number2 || userInput2 == number1 || userInput2 == number2){
            System.out.println("You won 1000$");
        }
        else {
            System.out.println("You did not win");
        }


        System.out.println("The lottery numbers are " + number1+ " " + number2);


        input.close();
    }
}