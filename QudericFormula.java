
// Shekib Hadad

//This program finds solves for quadratic equation.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a: ");
        double a = input.nextInt();

        System.out.print("Enter b: ");
        double b = input.nextInt();

        System.out.print("Enter c: ");
        double c = input.nextInt();

        double x1 = (- b + Math.sqrt((b*b)-(4*a*c)) )/2*a;
        double x2 = (- b - Math.sqrt((b*b)-(4*a*c)) )/2*a;

        System.out.printf("The First Solution is: %.1f \n", x1);
        System.out.printf("The Second Solution is: %.1f \n", x2);

    }
}