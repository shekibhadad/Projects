
// Shekib Hadad

//This a simple subtraction program.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number2 = (int)(Math.random() * 10);
        double number1 = (int)(Math.random() * 10) + number2;
        double correctAnswer = number1 - number2;
        double userAnswer;
        System.out.print("What is " + number1 + " - " + number2 + " = ");
        userAnswer = input.nextDouble();

        if(userAnswer == correctAnswer){
            System.out.println("Your answer is correct.");
        }
        if (userAnswer != correctAnswer){
            System.out.println("Your answer is not correct.");
        }


        input.close();

    }
}