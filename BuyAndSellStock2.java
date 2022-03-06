sd/-*package whatever //do not write package name here */

class BuyAndSellStock2 {
    public static int maxProfit(int[] prices) {
        int bd=0;
        int sd=0;
        int profit=0;
        for (int i=0;i<prices.length;i++){
            if(prices[i]>=prices[i-1]){
                sd++;// agar abhi tak sirf progit hii hua ..toh sirf selling dat eko hi bdhao
            }
            else{
                profit=prices[sd]-prices[bd];// ab dip aa rha hai toh profit nikaal lao
                bd=sd=i;// dono ko same kar do
            }
        }
        profit+=prices[sd]-prices[bd];// last wali val ko add kiya hai
        return profit;
        }
    
    public static void main(String [] args){
        int [] arr={7,1,5,6,4};
        int p=maxProfit(arr);
        System.out.println(p);
        
    }
}
    

    
    