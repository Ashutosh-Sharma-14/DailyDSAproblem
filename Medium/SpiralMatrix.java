//Given a matrix of size N x M. You have to find the Kth element which will obtain while traversing the matrix spirally starting from
// the top-left corner of the matrix.

package Medium;

public class SpiralMatrix {
    public static void main(String[] args) {

    }

    static int findKth(int[][] a,int n, int m, int k){
        int rowbegin = 0,colbegin = 0;
        int rowend = n-1;
        int colend = m-1;
        int count = 1;

        while(rowbegin<=rowend && colbegin<=colend){
            for (int j = colbegin; j <= colend; j++) {
                if(count ==k)
                    return a[rowbegin][j];
                count++;
            }
            rowbegin++;

            for (int i = rowbegin; i <= rowend; i++) {
                if(count ==k)
                    return a[i][colend];
                count++;
            }
            colend--;

            for (int j = colend; j >=colbegin ; j--) {
                if(count ==k)
                    return a[rowend][j];
                count++;
            }
            rowend--;

            for (int i = rowend; i >=rowbegin ; i--) {
                if(count ==k)
                    return a[i][colbegin];
                count++;
            }
            colbegin++;
        }
        return 0;
    }
}
