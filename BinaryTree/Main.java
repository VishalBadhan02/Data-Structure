package BinaryTree;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};

        TreeNode root = BinaryTree.buildTree(arr);

        System.out.println(root.data);                   // 1
        System.out.println(root.left.data);              // 2
        System.out.println(root.right.data);             // 3
        System.out.println(root.left.left.data);         // 4
        System.out.println(root.left.right.data);        // 5
        System.out.println(root.right.left.data);        // 6
    }
}