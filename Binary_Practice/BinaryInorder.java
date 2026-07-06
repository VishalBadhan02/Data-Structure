package Binary_Practice;

public class BinaryInorder {

    public void inOrder(TreeNode root){
        if(root==null) return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7};

        TreeNode root = BinaryTree.buildTree(a);

        BinaryInorder Bi = new BinaryInorder();
        Bi.inOrder(root);
    }
}
