class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0;
        int hi = n * m - 1;
        int mid = 0;
        while(lo<=hi){
            mid = lo +(hi-lo)/2;
            int row = mid / n;
            int col = mid % n;
            if(matrix[row][col] == target) return true;
            else if(target > matrix[row][col]){
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return false;
    }
}