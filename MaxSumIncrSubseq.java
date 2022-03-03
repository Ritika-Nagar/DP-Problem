class MaxSumIncrSubseq{
	static int maxSum(int [] arr){
		int n=arr.length;
		int i;
		int max=0;
		int [] dp =new int [n+1];
		for ( i=0;i<=n;i++){
			dp[i]=arr[i];
		}

		for(i=1;i<=n;i++){
			for(j=0;j<i;j++){
				if(arr[i]>arr[j] && dp[i]<dp[j]+arr[i]){
					dp[i]=dp[j]+arr[i];
				}
			}
		}

		for(i=0;i<n;i++){// in order to find the max value from dp table
			if(max<dp[i]){
				max=dp[i];
			}
		}
		return max;
	}
}