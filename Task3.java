package HW1;

import java.util.Scanner;

public class Task3 {
    public static void plus(int a, int b) {
        int res = a + b;
        System.out.println("Result: " + res);
    }

    public static void minus(int a, int b) {
        int res = a - b;
        System.out.println("Result: " + res);
    }

    public static void multi(int a, int b) {
        int res = a * b;
        System.out.println("Result: " + res);
    }

    public static void div(int a, int b) {
        double res = a / b;
        if (a % b == 0) {
            int result = (int) Math.round(res);
            System.out.println("Result: " + result);
        } else
            System.out.println("Result: " + res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("What action to highlight: ");
        String action = sc.next();
        if (action.equals("/"))
            div(a, b);
        else if (action.equals("*"))
            multi(a, b);
        else if (action.equals("-"))
            minus(a, b);
        else if (action.equals("+"))
            plus(a, b);
        else
            System.out.println("There is no such action.");
    }
}
