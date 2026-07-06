package BinaryTree;

public class BinaryTree {

    // Build tree from level order array
    public static TreeNode buildTree(int[] arr) {

        if (arr == null || arr.length == 0)
            return null;

        TreeNode[] nodes = new TreeNode[arr.length];

        // Create all nodes
        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new TreeNode(arr[i]);
        }

        // Connect nodes
        for (int i = 0; i < arr.length; i++) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.length)
                nodes[i].left = nodes[left];

            if (right < arr.length)
                nodes[i].right = nodes[right];
        }

        return nodes[0];
    }

}