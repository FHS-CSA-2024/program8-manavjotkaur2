//import stuff here

//Your code here

import java.util.Scanner;

public class IntegerOperation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Number 2: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double average = sum/2.0;
        int distance = Math.abs(difference);
        int maximum = ((firstNumber + secondNumber) + distance)/2;
        int minimum = ((firstNumber + secondNumber) - distance)/2;
        
        System.out.println("Original numbers are " + firstNumber + " and " + secondNumber);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
        System.out.println("Distance = " + distance);
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);
    }
}


//Paste console output below:
/*
Enter Number 1: 
13
Enter Number 2: 
20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Distance = 7
Maximum = 20
Minimum = 13
*/
