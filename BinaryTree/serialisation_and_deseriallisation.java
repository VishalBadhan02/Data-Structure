package BinaryTree;

// converting it into string

public class serialisation_and_deseriallisation {
    public static void main(String[] args) {
        
    }
}

if(root==NULL) return NULL;
if(root->value ==val){
    return root;
}
if(root->val>val){
    return (root->left,val);
}

else(root->val<val){
    return searchBST(root->right, val)
}