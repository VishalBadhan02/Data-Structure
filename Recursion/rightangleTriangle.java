package Recursion;

public class rightangleTriangle {
    void triangle(int n) {
        if (n == 0) {
            return;
        }
        triangle(n - 1);
        stars(n);
        System.out.println(" ");

    }

    void stars(int n) {
        if (n == 0) {
            return;
        }
        stars(n - 1);
        System.out.print("*");
    }

    public static void main(String[] args) {
        rightangleTriangle rat = new rightangleTriangle();
        rat.triangle(5);
    }
}
