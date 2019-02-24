/**
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

Example:

Input: 3
Output:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */
class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];
        if(n == 1){
            matrix[0][0] = 1;
            return matrix;
        }
        int cur = 0;
        int len = n-1;
        int count = 1;
        while(cur < n/2){
            for(int i=cur; i<len-cur;i++){
                matrix[cur][i] = count;
                matrix[i][len-cur] = count+len-2*cur;
                matrix[len-cur][len-i] = count+2*(len-2*cur);
                matrix[len-i][cur] = count + 3*(len-2*cur);                
                count++;
            }
            count = matrix[cur+1][cur]+1;
            cur++;
        }
        if(n%2 == 1)
            matrix[n/2][n/2] = n*n;
        return matrix;
    }
}