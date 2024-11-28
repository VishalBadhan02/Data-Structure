package Recursion;

public class arraySorting {
    void sorting(int[] a, int n) {
        if (n == 0) {
            if (n < a.length - 1 && a[n] < a[n + 1]) {
                int temp = a[n];
                a[n] = a[n + 1];
                a[n + 1] = temp;
                return;
            }
            return;
        }

        sorting(a, n - 1);
        if (n < a.length - 1 && a[n] < a[n + 1]) {
            int temp = a[n];
            a[n] = a[n + 1];
            a[n + 1] = temp;
            return;
        }
        return;
    }

    public static void main(String args[]) {
        arraySorting sr = new arraySorting();
        int a[] = { 3, 5, 2, 6, 7, 1 };
        sr.sorting(a, a.length - 1);
    }
}
