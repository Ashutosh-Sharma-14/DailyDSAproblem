package BinaryTrees;

import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}


public class IterativePostOrderTraversal {

    static Node buildTree(String str){
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static class Tree{
        ArrayList<Integer> postOrder(Node root){
            ArrayList<Integer> ans = new ArrayList<>();
            if(root == null){
                return ans;
            }
            Stack<Node> st = new Stack<Node>();
            st.push(root);

            while(!st.isEmpty()){
                Node curr = st.peek();
                if(curr.left==null && curr.right==null){
                    ans.add(curr.data);
                    st.pop();
                    curr = null;
                }
                else if(curr.left!=null){
                    st.push(curr.left);
                }
                else if (curr.right != null) {
                    st.push(curr.right);
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Tree g = new Tree();
            ArrayList<Integer> res = g.postOrder(root);
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.print("\n");
            t--;
        }
    }
}


