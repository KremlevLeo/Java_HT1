package HW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int res = (i * (i + 1)) / 2;
            System.out.print(res+" ");;
        }
    }

}
