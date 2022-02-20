package DP;

public class knapsackNotOptimised {
	
	static int knapSack(int W, int wt[], int val[], int n) 
    {     // Time Complexity: O(m*n)
        
        int [][] M= new int [n+1][W+1];
    
        // always try to see indices of arrays 
         for(int i=0;i<=n;i++){
             for(int j=0; j<=W;j++){
            	 if(i==0 || j==0){
                     M[i][j]=0;
                 }else if(wt[i-1]<=j){
                     M[i][j]=max(M[i-1][j], M[i-1][j-wt[i-1]]+ val[i-1]);
                 }
                 else{
                     
                     M[i][j]=M[i-1][j];
                 }
             }
         }
         
         return M[n][W];
}

static int max(int a, int b){
        return (a>b) ? a:b;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
