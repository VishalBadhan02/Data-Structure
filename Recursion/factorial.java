package Recursion;

public class factorial {
    int fact(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        factorial fc = new factorial();
        fc.fact(n);
        System.out.println("Factorial of " + n + " is " + fc.fact(n));
    }
}
