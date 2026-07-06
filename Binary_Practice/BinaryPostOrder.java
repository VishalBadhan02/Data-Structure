package Binary_Practice;

public class BinaryPostOrder {
      public void postOrder(TreeNode root){
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7};

        TreeNode root = BinaryTree.buildTree(a);

        BinaryPostOrder Bi = new BinaryPostOrder();
        Bi.postOrder(root);
    }
}
