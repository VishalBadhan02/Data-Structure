package Recursion;

public class checkSortedArray {
    void sorting(int[] a, int n) {
        if (n == 0) {
            if (a[n] < a[n + 1]) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
        sorting(a, n - 1);
    }

    public static void main(String[] args) {
        arraySorting sr = new arraySorting();
        int a[] = { 3, 5, 2, 6, 7, 1 };
        sr.sorting(a, a.length - 1);
    }
}
