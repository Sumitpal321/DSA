class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[][] dp = new int[2001][2001];
    public boolean canCross(int[] stones) {
        for(int i=0;i<stones.length;i++){
            map.put(stones[i], i);
        }
        for(int i=0;i<=2000;i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(stones, 0, 0);
    }
    public boolean solve(int[] stones, int curr_idx, int jump){
        if(stones[1] != 1) return false;
        if(curr_idx == stones.length - 1) return true;
        if(dp[curr_idx][jump] != -1) return dp[curr_idx][jump] == 1;

        for(int nextjump = jump - 1;nextjump<=jump+1;nextjump++){
            int nextstone = stones[curr_idx] + nextjump;
            if(nextjump > 0){
                if(map.containsKey(nextstone)){
                    int nextIndex = map.get(nextstone);

                    if(solve(stones, nextIndex, nextjump)){
                        dp[curr_idx][jump] = 1;
                        return true;
                    }
                }
            }
        }
        dp[curr_idx][jump] = 0;
        return false;
    }
}