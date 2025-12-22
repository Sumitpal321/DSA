class Solution {
    public void swap(int[]arr, int j,int k){
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
    public int majorityElement(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int j = i;
            while(j>=1 && arr[j]<arr[j-1]){
               swap(arr,j,j-1);
               j--;
            }
        }
        return arr[arr.length/2];
        
    }
}