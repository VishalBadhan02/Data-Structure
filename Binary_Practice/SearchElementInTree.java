package Binary_Practice;

public class SearchElementInTree {
    TreeNode tr = null;
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data == val) {
            return root;
        }
        searchBST(root.left, val);
        searchBST(root.right, val);
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        TreeNode root = BinaryTree.buildTree(arr);
        SearchElementInTree bst = new SearchElementInTree();
        TreeNode t =bst.searchBST(root, 2);
        System.out.println(t.data);
        System.out.println(t.left.data);
        System.out.println(t.right.data);

    }

}
