package calculator;

import java.util.Scanner;

class Calculator {

    static double result;   // static variable

    double num1;            // instance variables
    double num2;

    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void calculate(char operator) {

        double localResult = 0; // local variable

        switch (operator) {

            case '+': {
                double blockVar = num1 + num2;
                localResult = blockVar;
                break;
            }

            case '-': {
                double blockVar = num1 - num2;
                localResult = blockVar;
                break;
            }

            case '*': {
                double blockVar = num1 * num2;
                localResult = blockVar;
                break;
            }

            case '/': {
                if (num2 == 0) {
                    System.out.println("Division by zero not allowed");
                    return;
                }
                double blockVar = num1 / num2;
                localResult = blockVar;
                break;
            }

            default:
                System.out.println("Invalid operator");
                return;
        }

        result = localResult;
        System.out.println("Result: " + result);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Select (+, -, *, /): ");
        char op = sc.next().charAt(0);

        Calculator calc = new Calculator(a, b);
        calc.calculate(op);

        System.out.println("Instance Variable num1: " + calc.num1);
        System.out.println("Instance Variable num2: " + calc.num2);
        System.out.println("Static Variable result: " + Calculator.result);

        sc.close();
        System.out.println("Program ended");
    }
}