package Binary_Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> node = new LinkedList<>();

        node.offer(root);

        while (!node.isEmpty()) {

            int size = node.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = node.poll();
                level.add(current.data);
                if (current.left != null) {
                    node.offer(current.left);
                }
                if (current.right != null) {
                    node.offer(current.right);
                }
            }

            ans.add(level);

        }
        return ans;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        TreeNode root = BinaryTree.buildTree(arr);

        LevelOrder lo = new LevelOrder();
        // ArrayList<ArrayList<Integer>> result = lo.levelOrder(root);

        

        System.out.println(lo.levelOrder(root));
    }
}

// package Binary_Practice;
// import java.util.LinkedList;
// import java.util.Queue;
// public class LevelOrder {
//     public void levelOrder(TreeNode root) {
//         // If tree is empty
//         if (root == null) {
//             return;
//         }
//         // Create queue
//         Queue<TreeNode> queue = new LinkedList<>();
//         // Put root in queue
//         queue.offer(root);
//         // Traverse until queue becomes empty
//         while (!queue.isEmpty()) {
//             // Remove front node
//             TreeNode current = queue.poll();
//             // Print data
//             System.out.print(current.data + " ");
//             // Add left child
//             if (current.left != null) {
//                 queue.offer(current.left);
//             }
//             // Add right child
//             if (current.right != null) {
//                 queue.offer(current.right);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7};
//         TreeNode root = BinaryTree.buildTree(arr);
//         LevelOrder lo = new LevelOrder();
//         lo.levelOrder(root);
//     }
// }
