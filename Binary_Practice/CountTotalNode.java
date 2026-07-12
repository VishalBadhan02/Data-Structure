package Binary_Practice;

public class CountTotalNode {

    int count = 0;

    public int totalNode(TreeNode node) {
        if (node == null) {
            return count;
        }
        if (node != null) {
            count = node.data + count;
        }
        totalNode(node.left);
        totalNode(node.right);

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        TreeNode root = BinaryTree.buildTree(arr);
        CountTotalNode ct = new CountTotalNode();

        System.out.println(ct.totalNode(root));
    }
}
