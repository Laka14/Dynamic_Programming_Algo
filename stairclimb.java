//at a time u can jump 1,2,3 stairs
//climbing stairs using dp 
    // tabulation 
    public static int stairsways_tab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int stair=3; stair<n+1; stair++){
            dp[stair] = dp[stair-1] + dp[stair-2] + dp[stair-3];
        }
        return dp[n]; //O(n)
    }
    //memoization O(n) | normal recursion O(2^n)
//can jump 1,2 stairs at a time
    public static int stairways_memo(int n, int ways[]){
        //n=stair number
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n] = stairways_memo(n-1, ways) + stairways_memo(n-2, ways);
        return ways[n];
    }
