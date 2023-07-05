package Easy;

import java.util.*;

public class LevelOrderTraversal {
    public static void main(String[] args) {

    }

    class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static List<List<Integer>> levelOrderTraversal(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int count = q.size();
            List<Integer> lst_for_each_level = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                lst_for_each_level.add(curr.data);
            }
            ans.addAll(Collections.singleton(lst_for_each_level));
        }

        return ans;
    }

    static ArrayList<Integer> spirallevelOrderTraversal(Node root){
          int level = 1;
          ArrayList<Integer> ans = new ArrayList<>();
          if(root ==null) return ans;

          Queue<Node> q = new LinkedList<Node>();
          q.add(root);

          while(!q.isEmpty()){
              int count = q.size();
              ArrayList<Integer> lst_for_odd_level = new ArrayList<>();

              for (int i = 0; i < count; i++) {
                  Node curr = q.poll();
                  if(level%2 == 0){
                      ans.add(curr.data);
                  }
                  else{
                      lst_for_odd_level.add(curr.data);
                  }

                  if(curr.left!=null) q.add(curr.left);
                  if(curr.right!=null) q.add(curr.right);
              }
              if(!lst_for_odd_level.isEmpty()){
                  Collections.reverse(lst_for_odd_level);
                  ans.addAll(lst_for_odd_level);
              }
              level++;
          }
          return ans;
    }
}
