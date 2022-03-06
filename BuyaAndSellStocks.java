/*package whatever //do not write package name here */

class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int lsp=Integer.MAX_VALUE;// least selling price ==best buying price 
        int op=0;// overall profit
        int pist=0;// profit if sold today
        
        for (int i=0;i<prices.length;i++){
            
            if(prices[i]<lsp){
                
                lsp=prices[i];
                
            }
           
            
            pist=prices[i]-lsp;
            
            
            if(pist>op){
                op=pist;
                
            }
        }
        return op;
        
    }
    
    public static void main(String [] args){
        int [] arr={7,1,5,6,4};
        int p=maxProfit(arr);
        System.out.println(p);
        
    }
}
    

    
    