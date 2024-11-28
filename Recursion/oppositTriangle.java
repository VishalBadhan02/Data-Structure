package Recursion;

public class oppositTriangle {
    void triangle(int n, int currentrow, int c) {
        if (c < currentrow) {
            return;
        }
        space(n - 1);
        star(currentrow);
        System.out.println();
        currentrow++;
        triangle(n - 1, currentrow, c);
    }

    void space(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(" ");
        space(n - 1);

    }

    void star(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        star(n - 1);

    }

    public static void main(String[] args) {
        oppositTriangle ot = new oppositTriangle();
        ot.triangle(5, 1, 5);
    }
}
