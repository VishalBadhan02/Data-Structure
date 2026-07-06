package BinaryTree;
    
public class inorderTraveral {
     public static void inorder(TreeNode root) {

        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        TreeNode root = BinaryTree.buildTree(arr);

        inorder(root);
    }
    
}
