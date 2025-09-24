
// Shekib Hadad

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //1 Area of a circle

        double r;

        System.out.print("Enter the Radius: ");
        r = input.nextDouble();


        System.out.printf("The Area of Circle is: %.2f \n" , Math.PI * Math.pow( r, 2));



        //2 Perimeter of a rectangle

        double length;
        double width;

        System.out.print("Enter the Length: ");
        length = input.nextDouble();

        System.out.print("Enter the width: ");
        width = input.nextDouble();

        System.out.printf("The Perimeter of the Rectangle is: %.2f \n", 2*length + 2*width);



        //3 Swap two numbers

        int num1;
        int num2;

        System.out.print("Enter the First Num: ");
        num1 = input.nextInt();

        System.out.print("Enter the Second Num: ");
        num2 = input.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);



        //4 Simple interest

        double P;
        int R;
        int T;

        System.out.print("Enter the principle: ");
        P = input.nextDouble();

        System.out.print("Enter the rate in (%): ");
        R = input.nextInt();

        System.out.print("Enter the time (in year): ");
        T = input.nextInt();


        System.out.println("The interest after " + T + " year is: " + (P*T*R)/100 );




        //5 Even or odd number

        int number;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is even.");
        }
        else {
            System.out.println(number + "is odd.");
        }




        //6 Sum of N natural numbers

        int n;


        System.out.print("Enter the number: ");
        n = input.nextInt();

        System.out.println("The sum of " + n + " numbers is: " + n * (n + 1) / 2 );




        //7 Celsius to fahrenheit

        double C;

        System.out.print("Enter the temperature in celsius: ");
        C = input.nextDouble();

        System.out.printf("The temperature in fahrenheit is:%.1f \n", (C * 9 / 5) + 32 );




        //8 Maximum of two number

        int a;
        int b;

        System.out.print("Enter the first number: ");
        a = input.nextInt();

        System.out.print("Enter the second number: ");
        b = input.nextInt();


        int max;
        if (a > b){
            System.out.println(max = a);
        }
        else {
            max = b;
        }

        System.out.println("The maximum number is " + max);




        //9 Show the leap year

        int year;

        System.out.print("Enter the year: ");
        year = input.nextInt();

        if (year % 4 == 0){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }



         //10 Swap the numbers



        input.close();


        }
    }
