package Binary_Practice;

public class StackUnderstanding {
    public void hello(){
        System.out.println("hello");
        hello();
    }
    public TreeNode st(TreeNode root){
        if(root == null){
            return null;
        }
        st(root.left);
        st(root.right);
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Math.max(2,3));

        TreeNode root = BinaryTree.buildTree(arr);
        StackUnderstanding su = new StackUnderstanding();
        // su.st(root);
        su.hello();
    }
}
