 // UNBOUNDED KNAPSACK
 class CoinChange {
    public int min(int a, int b){
        return a>b ? b:a;
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int [][] dp= new int [n+1][amount+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
            
        }
        
        for(int i=0;i<=amount;i++){
            dp[0][i]=100000;
            
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }
            }
        }
        int c=10000;
        
        return dp[n][amount]>c ? -1:dp[n][amount];
        
    }
}