package Recursion;

public class oppositReverseTriangle {
    void reverseOpposit(int n, int row, int c) {
        if (c < row) {
            return;
        }
        space(row - 1);
        star(n);
        System.out.println();
        row++;
        reverseOpposit(n - 1, row, c);

    }

    void space(int n) {
        if (n == 0) {
            return;
        }
        space(n - 1);
        System.out.print(" ");

    }

    void star(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        star(n - 1);

    }

    public static void main(String[] args) {
        oppositReverseTriangle orc = new oppositReverseTriangle();
        orc.reverseOpposit(5, 1, 5);
    }
}
