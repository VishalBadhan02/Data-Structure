package Binary_Practice;

public class MaximumDepthofBinaryTree {

    public int maximumDepth(TreeNode node) {
        if(node == null){
            return 0;
        }

        int left = maximumDepth(node.left);
        int right = maximumDepth(node.right);

        System.out.println(1 + Math.max(left, right));

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        TreeNode root = BinaryTree.buildTree(arr);
        MaximumDepthofBinaryTree md = new MaximumDepthofBinaryTree();
        md.maximumDepth(root);
    }
}
