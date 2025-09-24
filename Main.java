
// Shekib Hadad

// This program calculates your body mass index.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height (m): ");
        double height = input.nextDouble();

        System.out.println("Enter your weight (kg): ");
        double weight = input.nextDouble();

        double BMI = weight / Math.pow(height, 2);
        System.out.printf("Your Body Mass Index is: %.1f \n", BMI);

        if(BMI < 18.5){
            System.out.println("You are underweight.");
        }
        else if(BMI >= 18.5 && BMI < 25.0){
            System.out.println("You are normal.");
        }
        else if (BMI >= 25.0 && BMI < 30.0){
            System.out.println("You are overweight.");
        }
        else{
            System.out.println("You are obese.");
        }


        input.close();
    }
}