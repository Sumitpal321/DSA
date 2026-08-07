class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int noz = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                ans.add(arr[i]);
            }
            noz++;
        }
        for(int i=0;i<noz;i++){
            ans.add(0);
        }
        for(int i=0;i<n;i++){
            arr[i] = ans.get(i);
        }
    }
}