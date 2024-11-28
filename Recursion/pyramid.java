package Recursion;

public class pyramid {
    void nextLine(int n, int row, int c) {
        if (c < row) {
            return;
        }
        space(n - 1);
        star(row);
        star(row - 1);
        System.out.println();
        row++;
        nextLine(n - 1, row, c);
        space(n-1);
        star(row-2);
        star(row-1);
        System.out.println();

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
        pyramid py = new pyramid();
        py.nextLine(5, 1, 5);
    }
}
