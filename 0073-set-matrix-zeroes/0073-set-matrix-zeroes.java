class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length, m=matrix[0].length;
        int[] row = new int[n+1];
        int[] col = new int[m+1];
        Arrays.fill(row,0);
        Arrays.fill(col,0);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                   row[i]=1;
                   col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}