package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;

public class BoundaryTraversal {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> boundary(Node node){
        ArrayList<Integer> ans = new ArrayList<>();
        if(node == null){
            return ans;
        }

        if(node.left!= null || node.right!=null){
            ans.add(node.data);
        }
        leftBoundary(node,ans);
        leafnodes(node,ans);
        rightBoundary(node,ans);
        return ans;
    }

    static void leafnodes(Node node, ArrayList<Integer> ans){
        if(node.left == null && node.right == null){
            ans.add(node.data);
            return;
        }
        if(node.left!=null) leafnodes(node.left,ans);
        if(node.right!=null) leafnodes(node.right,ans);
    }

    static void leftBoundary(Node node, ArrayList<Integer> ans){
        Node curr = node.left;
        while (curr!=null){
            if(!(curr.left == null && curr.right == null)){
                ans.add(curr.data);

                if(curr.left!=null) curr = curr.left;
                else curr = curr.right;
            }
        }
    }

    static void rightBoundary(Node node, ArrayList<Integer> ans){
        Node curr = node.right;
        ArrayList<Integer> right = new ArrayList<>();

        while(curr!=null){
            if(!(curr.left == null && curr.right == null)){
                right.add(curr.data);
            }

            if(curr.right!=null) curr = curr.right;
            else curr = curr.left;
        }
        for(int i = right.size() -1; i >= 0;--i){
            ans.add(right.get(i));
        }
    }
}
