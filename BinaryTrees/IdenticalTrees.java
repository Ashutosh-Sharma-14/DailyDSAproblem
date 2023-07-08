package BinaryTrees;

public class IdenticalTrees {
    public static void main(String[] args) {

    }

    static boolean isIdentical(Node root1, Node root2){
//        if both the roots are null
        if(root1 == null && root2 == null){
            return true;
        }
//        if one root is null and the other is not. If we try to compare the root.data values
//        we might encounter null pointer exception as (null).data is not defined
        if(root1 == null || root2 == null){
            return false;
        }
        boolean left = isIdentical(root1.left,root2.left);
        boolean right = isIdentical(root1.right,root2.right);

        return root1.data == root2.data && left && right;
    }
}
