package HW1;

public class Task2 {
    public static boolean simple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

    public static void main(String[] args) {
        int top = 100;
        for (int i = 2; i < top; i++) {
            if (simple(i))
                System.out.print(i+" ");
        }
    }
}
