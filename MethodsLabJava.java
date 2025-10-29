/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab.java;
import java.util.Scanner;
/**
 *
 * @author ATIL_CPE112
 */
public class MethodsLabJava {

    /**
     * @param args the command line arguments
     */
    public static void greetUser() {
        System.out.println("KOMOSTA BAI DAYON MAO NI AKONG JAVA PROGRAM!");

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int multiply(double a, double b) {
        if (b == 0) {
            System.out.println("ERROR BAI DIVISION NY ZERO");
            return 0;
        }

        return a / b;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);

        greetUser();

        System.out.println("bulohaton 2: Basic Arithmetic Calculator");
        System.out.println("type diri ang number: ");
        int num1 = type.nextInt();
        System.out.println("type diri ang number: ");
        int num2 = type.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplacation: " + multiply(num1, num2));
        System.out.println("division: " + divide(num1, num2));

        System.out.println("Bulohaton 3: Factorial Calculator");
        System.out.print("Ibutang ang number: ");
        int n = type.nextInt();
        System.out.println("FaCtorial of: " + n + factorial(n));

        System.out.println("Bulohaton 4: Array Summary");
        int[] numbers = {10, 20, 30, 40, 50};
         int total = sumArray(numbers);
        System.out.println("Sum of Array = " + sumArray(numbers));

        System.out.println("Bulohaton 5: Prime Number Checker");
        System.out.print("Enter a number: ");
        int primeNum = type.nextInt();
        if (isPrime(primeNum)) {
            System.out.println(primeNum + " KNI PRIME NUMBER.");
        } else {
            System.out.println(primeNum + " BUBU DILI NA PRIME NUMBER.");
        }

        type.close();

    }
}
