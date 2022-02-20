package DP;

public class LCS {
	static int lcs(int x, int y, String s1, String s2)
    {   int [] [] M= new int [x+1][y+1]; 
        if(x==0 || y==0){
            return 0;// base case
        }
        
        for(int i=0;i<=x;i++){
            for(int j=0;j<=y;j++){
                if(i==0  || j==0){
                    M[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){// here charAt() method returns the character at the specified index in a string.

//              The index of the first character is 0, the second character is 1, and so on.


                    M[i][j]=M[i-1][j-1]+1;
                }else{
                    M[i][j]=max(M[i-1][j],M[i][j-1]);
                }
            }
        }
        return M[x][y];
    }
    static int max(int a, int b){
        return (a>b) ? a:b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
