package BinaryTrees;

public class MaximumPathSum {
    public static void main(String[] args) {

    }

    static int max=Integer.MIN_VALUE;
    int findMaxSum(Node node)
    {
        //your code goes here
        sum(node);
        return max;
    }

    static int sum(Node node){
        if(node==null){
            return 0;
        }

        int left=Math.max(0,sum(node.left));
        int right=Math.max(0,sum(node.right));

        max=Math.max(max,left+right+node.data);

        return Math.max(left,right)+node.data;
    }
}
