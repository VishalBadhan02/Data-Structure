package Recursion;

public class reverseTriangle {
    void ReverseTriangle(int n) {
        if (n == 0) {
            return;
        }
        star(n);
        System.out.println("");
        ReverseTriangle(n - 1);
    }

    void star(int n) {
        if (n == 0) {
            return;
        }
        star(n - 1);
        System.out.print("*");
    }

    public static void main(String[] args) {
        reverseTriangle rt = new reverseTriangle();
        rt.ReverseTriangle(5);
    }
}
