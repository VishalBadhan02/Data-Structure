package Binary_Practice;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    public void levelOrder(TreeNode root) {

        // If tree is empty
        if (root == null) {
            return;
        }

        // Create queue
        Queue<TreeNode> queue = new LinkedList<>();

        // Put root in queue
        queue.offer(root);

        // Traverse until queue becomes empty
        while (!queue.isEmpty()) {

            // Remove front node
            TreeNode current = queue.poll();

            // Print data
            System.out.print(current.data + " ");

            // Add left child
            if (current.left != null) {
                queue.offer(current.left);
            }

            // Add right child
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        TreeNode root = BinaryTree.buildTree(arr);

        LevelOrder lo = new LevelOrder();

        lo.levelOrder(root);
    }
}
