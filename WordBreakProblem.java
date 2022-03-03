class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        int n=B.size();
        
        int s=A.length();
        
        boolean [] dp= new boolean[s+1];
        dp[0]=true; // ye thoda confusing hai...basically this is true for empty strings ..since they can always segmented
        
        
        
        for(int i=0;i<=s;i++){
            for(int j=0;j<i;j++){
                
                if(dp[j] && B.contains(A.substring(j,i))){
                    dp[i]=true;// agar ynha tak true aa gya h ..mtlb piche tak string valid thi ..toh break kar do
                    break;
                }
                
            }
        }
        
        if(dp[s]){
            return 1;
        }else{
            return 0;
        }
        
    }
}


// https://onedrive.live.com/view.aspx?resid=13ED14EBEAAACEC7%2130384&id=documents&wd=target%28ADA.one%7CDED5F4C8-1149-42BC-9F83-C26B4CFC3B97%2FWord%20Break%20Problem%7C9782E1DC-3703-4ED6-8578-ABC6A2D6985E%2F%29
onenote:https://d.docs.live.net/13ed14ebeaaacec7/Documents/ritika's%20Notebook/ADA.one#Word%20Break%20Problem&section-id={DED5F4C8-1149-42BC-9F83-C26B4CFC3B97}&page-id={9782E1DC-3703-4ED6-8578-ABC6A2D6985E}&end