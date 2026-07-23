class Solution {
    public void swap(int[][] arr, int r1, int c1, int r2, int c2){
        int temp = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = temp;
    }
    public void rotate(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                swap(arr, i, j, j, i);
            }
        }
        for(int i=0;i<m;i++){
            int a =0; int b = n-1;
            while(a<b){
                swap(arr, i, a, i, b);
                a++;
                b--;
            }
        }
    }
}