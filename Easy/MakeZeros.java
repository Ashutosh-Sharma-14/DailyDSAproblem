//Given a matrix of  size n x m. Your task is to make Zeroes, that means in whole matrix when you find a zero, convert its upper, lower, left, and
//right value to zero and make that element the sum of the upper, lower, left and right value. Do the following tasks according to the initial matrix.

package Easy;

public class MakeZeros {
    public static void main(String[] args) {

    }

    static void makeZero(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[n][m];
        // creating an ans matrix where the changes will be reflected.
        // this cannot be done with constant space as there may be elements which are converted to 0 for an element a but is required to include in the sum for another element
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m;j++){
                ans[i][j] = matrix[i][j];
            }
        }

        // making changes in the ans instead of matrix so that elements used for the calculation remains unchanged
        // this also makes sure that the elements that are converted to 0 during the process are not taken into consideration while solving the problem
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    int sum = 0;
                    if(i > 0){
                        sum+= matrix[i-1][j];
                        ans[i-1][j] = 0;
                    }
                    if(j > 0){
                        sum+= matrix[i][j-1];
                        ans[i][j-1] = 0;
                    }
                    if(i < n-1){
                        sum+= matrix[i+1][j];
                        ans[i+1][j] = 0;
                    }
                    if(j < m-1){
                        sum+= matrix[i][j+1];
                        ans[i][j+1] = 0;
                    }

                    ans[i][j] = sum;
                }
            }
        }


        // copying the changed elements to the matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m;j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}
