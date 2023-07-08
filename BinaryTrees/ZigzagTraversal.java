package BinaryTrees;

import java.util.*;

public class ZigzagTraversal {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> zigzagTraversal(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 1;

        while(q.size()!=0){
            ArrayList<Integer> lst_for_even_level = new ArrayList<>();
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (level%2 == 0){
                    lst_for_even_level.add(curr.data);
                }
                else{
                    ans.add(curr.data);
                }

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }

            if(lst_for_even_level.isEmpty() == false){
                Collections.reverse(lst_for_even_level);
                ans.addAll(lst_for_even_level);
            }
            level++;
        }
        return ans;
    }
}
