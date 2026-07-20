package Binary_Practice;

public class MaxAndMinValue {

    static  int max = 0;

    public static  int maxValue(TreeNode node) {
        if (node == null) {
            return max;
        }
        int temp = node.data;
        if (temp > max) {
            max = temp;
        }
        maxValue(node.left);
        maxValue(node.right);
        return max;
    }

    public int minValue(TreeNode node, int min) {
        if (node == null) {
            return min;
        }
        int temp = node.data;
        if (temp < max) {
            max = temp;
        }
        maxValue(node.left);
        maxValue(node.right);
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        TreeNode root = BinaryTree.buildTree(arr);

        MaxAndMinValue mm = new MaxAndMinValue();
        System.out.println(mm.maxValue(root));
        System.out.println(mm.minValue(root, root.data));
        
    }
}
