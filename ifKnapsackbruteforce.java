 public static int Knapsack(int val[], int wt[], int w, int n){
        if(w==0 || n==0){
            return 0;
        }      
        if(wt[n-1] <= w){
            //include
            int ans1 = val[n-1] + Knapsack(val, wt, w-wt[n-1], n-1);
            //exclude
            int ans2 = Knapsack(val, wt, w, n-1);
            return Math.max(ans1, ans2);
        }
        //not valid
        return Knapsack(val, wt, w, n-1);
