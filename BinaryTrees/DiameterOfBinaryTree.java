package BinaryTrees;

import static BinaryTrees.BinaryTreeBuilder.buildTree;
import static BinaryTrees.HeightOfBinaryTree.treeHeight;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        String input = "[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]";
        Node root = buildTree(input);
        int res = diameter(root);
    }

    static int maxHeight = 0;
    static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int left = treeHeight(root.left);
        int right = treeHeight(root.right);

        if(maxHeight < left+right) {
            maxHeight = left + right;
        }
        diameter(root.left);
        diameter(root.right);
        return maxHeight;
    }
}
