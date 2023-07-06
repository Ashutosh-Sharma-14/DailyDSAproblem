package BinaryTrees;

public class HeightOfBinaryTree {
    public static void main(String[] args) {

    }

    static int treeHeight(Node node){
        if(node == null){
            return 0;
        }

        int left_height = treeHeight(node.left);
        int right_height = treeHeight(node.right);

        return 1+Math.max(left_height,right_height);
    }
}
