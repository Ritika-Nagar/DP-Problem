MinDiffSubset
import java.lang.Math;

public class MinDiffSubset {
    public int solve(int[] A) {
        int n=A.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+A[i];
        }
        boolean [][] dp= new boolean [n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
                if(A[i-1]>sum){
                    dp[i][j]=dp[i-1][j];
                }else if(A[i-1]==sum){
                    dp[i][j]=true;
                }
                else{
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-A[i-1]];
                }
            }
        }

        int diff= Integer.MAX_VALUE;
        for(int k=0;k<=sum/2;k++){// becoz sum value in S1 will be less than sum/2...toh ush se pehle valo me hi iterate kar va rhe hai
            int SI=k;
            int SII=sum-k;
            if(dp[n][k]==true && diff> Math.abs(SI-SII)){// true is just to check if, is it possible to have this sum value when we 
                                                        // are onsidering k items at a time.
                diff=abs(SI=SII);
            }
        }

        return diff;
    }
}
