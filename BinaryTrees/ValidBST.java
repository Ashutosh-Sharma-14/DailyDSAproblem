package BinaryTrees;

public class ValidBST {
    static boolean ans = true;
    static boolean isValid(Node root){
        return ans;
    }

    static void leftChecker(Node root,Node prev){
        if(root.left!= null) leftChecker(root.left,root);
        if(root.data > prev.data){
            ans = false;
            return;
        }
        if(root.right!=null) rightChecker(root.right,root);
    }

    static void rightChecker(Node root,Node prev){
        if(root.right!= null) rightChecker(root.right,root);
        if(prev.data > root.data){
            ans = false;
            return;
        }
        if(root.left!= null) leftChecker(root.left,root);
    }
}
