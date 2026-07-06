package Binary_Practice;

public class TreeTesting {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};

        TreeNode tr =  BinaryTree.buildTree(arr);

        System.out.println(tr.data);
    }
}
