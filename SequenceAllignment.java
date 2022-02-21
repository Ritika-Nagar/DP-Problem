public class SequenceAllignment{
	public int min(int a, int b){
		return a>b ? b: a;
	}
	public int togetminPenalty(String X,  String Y, int pgap, int pxy){
		int m=X.length;
		int n=Y.length;

		int [] [] M= new int [m+1][n+1];

		for(int k=0;k<=(m+n+1);k++){

		}
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0 || j==0){
					M[i][0]=i*pgap;
					M[0][j]=j*pgap;
				}
				else if(X.charAt(i-1)==Y.charAt(j-1)){
					M[i][j]=M[i-1][j-1];// Match ..go over digonal elements 
				}else{
					M[i][j]= min(min(M[i-1][j-1]+pxy// Mismatch
									, M[i-1][j]+pgap),// ek me elemnt dusre me gap, so jime elem ush ke optimal sol chota kar diya
										M[i][j-1]+pgap);
				}
			}
		}
		return M[m][n];
	}

}