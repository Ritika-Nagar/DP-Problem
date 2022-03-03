class Solution{
    
    int max(int a, int b){
        return (a>b) ? a:b;
    }
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        int maxi=Integer.MIN_VALUE;// max_so_far
        int meh=0;// max_ending_here
        
        for(int i=0;i<arr.length;i++){
            meh=max(meh+arr[i],arr[i]);
            maxi=max(meh,maxi);
            
            
            
        }
        
        return maxi;
        
        
    }
    
}

