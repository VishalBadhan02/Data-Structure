package Binary_Practice;

public class BinaryTree {
    public static TreeNode buildTree(int[] arr){

        if(arr == null || arr.length ==0){
            return  null;
        }

        TreeNode[] nodes = new TreeNode[arr.length];

        for(int i=0; i<arr.length;i++){
            nodes[i] = new TreeNode(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            int right = 2 *i +2;
            int left = 2 *i +1;

            if(right<arr.length){
                nodes[i].right = nodes[right];
            }
            if(left<arr.length){
                nodes[i].left = nodes[left];
                
            }
        }

        return nodes[0];
        
    }
}
