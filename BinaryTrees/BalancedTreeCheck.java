package BinaryTrees;

public class BalancedTreeCheck {
    public static void main(String[] args) {

    }

//    naive approach - go to each node and calculate the left and right height for each node
    static boolean isBalanced(Node root){
        if(root == null){
            return true;
        }
//        calculating height for each node
        int lft = height(root.left);
        int right = height(root.right);

//        checking the condition
        if(Math.abs(lft-right) > 1) return false;

//        recursively calling the function to check on each node
        boolean left_balanced = isBalanced(root.left);
        boolean right_balanced = isBalanced(root.right);

        if(left_balanced == false || right_balanced==false){
            return false;
        }
        return true;
    }

    static boolean isBalancedOptimized(Node root){
        int ans = check_height(root);
        if(ans==-1) return false;
        else return true;
    }

    static int check_height(Node root){
        if(root == null){
            return 0;
        }

        int lft = check_height(root.left);
        int right = check_height(root.right);

        if(lft==-1 || right==-1) return -1;

        if(Math.abs(lft-right) > 1 ) return -1;
        return 1+Math.max(lft,right);
    }

    static int height(Node root){
        if(root == null){
            return 0;
        }
        int lft = height(root.left);
        int right = height(root.right);

        return 1+Math.max(lft,right);
    }
}
