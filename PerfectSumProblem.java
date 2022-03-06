class PerfectSumProblem {
    	public static void perfectSum(int arr[],int n, int sum) 
	{ 
	    int [][]dp= new int [n+1][sum+1];
	    
	    
	    for(int i=0;i<=n;i++){
	        dp[i][0]=1;
	    }
	    for(int j=0;j<=sum;j++){
	        dp[0][j]=0;
	    }
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=sum;j++){
	            
	            if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
	            else if(arr[i-1]==j){
	                dp[i][j]=1;
	                }
	            else {
                    dp[i][j]=dp[i-1][j]+ dp[i-1][j-arr[i-1]];
                }
	            
	           }
	    }
	    
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=sum;j++){
	            System.out.print(dp[i][j]+" ");
	        }
	        System.out.println();
	        
	       
	    }
	    
	    System.out.println("answer is :"+ dp[n][sum]);
	    
	    } 
	    
	    public static void main(String [] args){
	        int [] arr={3,1,2,3};
	        int sum=6;
	        
	        perfectSum(arr,4,sum);
	    }
}