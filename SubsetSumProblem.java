class SubsetSumProblem{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        boolean [][] dp= new boolean[N+1][sum+1];
        
        
        // here you are using table ...that means bottom up problem 
        
        for(int k=0;k<=sum;k++){
            dp[0][k]=false;
        }
        
        for(int k=0;k<=N;k++){
            dp[k][0]=true;
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=sum;j++){
                
                
                 
                if(j>=arr[i-1]){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];// element is included 
                }else{
                    dp[i][j]=dp[i-1][j];//element not included
                }
            }
        }
        return dp[N][sum];
    }
}