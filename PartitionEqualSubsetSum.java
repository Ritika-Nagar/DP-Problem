class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int N= nums.length;
        int sum=0;
        for(int i=0;i<N;i++){
            sum=sum+nums[i];
        }
        
        if((sum%2)!=0){
            return false;
        }
        
        int s=sum/2;
        
        boolean [][]dp= new boolean[N+1][s+1];
        for(int i=0;i<=N;i++){
            dp[i][0]=true;
        }
        for(int k=0;k<=s;k++){
            dp[0][k]=false;
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=s;j++){
                
                if(nums[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else if(j==nums[i-1]){
                    dp[i][j]=true;
                }
                else {
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        
        return dp[N][s];
    }
}