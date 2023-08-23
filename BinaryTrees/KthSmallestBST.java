package BinaryTrees;

public class KthSmallestBST {

    public static void main(String[] args) {

    }
    static int ans = -1;
    static int count = 0;

    public int KthSmallestElement(Node root, int K) {
        if(K > size(root)) return -1;
        count = K;
        inorder(root,K);
        return ans;
    }

    static void inorder(Node root, int K){

        if(root.left != null) inorder(root.left,K);
        count--;
        if(count == 0){
            ans = root.data;
            return;
        }
        if(root.right != null) inorder(root.right,K);
    }

    static int size(Node root){
        if(root == null){
            return 0;
        }

        int leftSize = size(root.left);
        int rightSize = size(root.right);

        return 1+leftSize+rightSize;
    }
}
