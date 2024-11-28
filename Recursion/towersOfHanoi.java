package Recursion;

public class towersOfHanoi {
    void TowerOfHanoi(int n, char a, char c, char b) {
        if (n == 1) {
            System.out.println("Disk " + n + " is moved from " + a + " pol to " + c);
            return;
        } 
        TowerOfHanoi(n - 1, a, b, c);
        System.out.println("Disk " + n + " is moved from " + a + " pol to " + c);
        TowerOfHanoi(n - 1, b, c, a);
    }

    public static void main(String[] args) {
        towersOfHanoi toh = new towersOfHanoi();
        int n = 4;
        toh.TowerOfHanoi(n, 'A', 'C', 'B');
    }
}
