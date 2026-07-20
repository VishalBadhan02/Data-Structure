package Binary_Practice;

public class CountLeafNodes {

    int count = 0;

    public int leafNodes(TreeNode node) {
        if (node == null) {
            return count;
        }
        if (node.left == null && node.right == null) {
            count++;
        }
        leafNodes(node.left);
        leafNodes(node.right);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        TreeNode root = BinaryTree.buildTree(arr);
        CountLeafNodes ct = new CountLeafNodes();

        System.out.println(ct.leafNodes(root));
    }
}
