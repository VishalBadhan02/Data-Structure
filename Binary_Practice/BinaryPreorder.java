package Binary_Practice;

public class BinaryPreorder {

    public void preorder(TreeNode root){
        if(root ==null) return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        TreeNode root = BinaryTree.buildTree(arr);

        BinaryPreorder Bp = new BinaryPreorder();
        Bp.preorder(root);
    }
}
