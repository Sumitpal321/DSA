class Solution {
    public int[] findDiagonalOrder(int[][] arr) {
        if(arr.length == 0 || arr[0].length == 0) return new int[0];
        int m = arr.length;
        int n = arr[0].length;
        int[] ans = new int[m*n];

        int i=0;
        int row = 0;
        int col = 0;

        boolean up = true;
        while(row<m && col<n){
            //going up
            if(up){
                while(row>0 && col<n-1){
                    ans[i++] = arr[row][col];
                    row--;
                    col++;
                }
                ans[i++] = arr[row][col];
                if(col == n-1){
                    row++;
                }
                else col++;
            }
            else{
                while(row<m-1 && col>0){
                    ans[i++] = arr[row][col];
                    row++;
                    col--;
                }
                ans[i++] = arr[row][col];
                if(row == m-1){
                    col++;
                }
                else row++;
            }
            up = !up;
        }
        return ans;
    }
}