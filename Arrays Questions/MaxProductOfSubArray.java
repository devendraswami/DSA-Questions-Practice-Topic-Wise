
// LeetCode Question 


public class MaxProductOfSubArray {
     
    public static int findProductOfSubArray(int []nums) {

        int pre = 1; 
        int suf = 1; 
        int result = Integer.MIN_VALUE; 
         int n = nums.length; 

         for(int i = 0; i<nums.length; i++ ) {
            
            if(pre == 0) { pre = 1; } 
            if(suf == 0 ) {suf = 1; } 

            pre = pre*nums[i]; 
            suf = suf*nums[n-i-1]; 

            result = Math.max(result, Math.max(pre,suf)); 

         }

        return result; 
    }

    public static void main(String[] args) {
        // Ques We Have to calculate the maximum product of SubArray  

        int arr[] = {1,2,3,-4,0,1,2,3,4}; 

        int result = findProductOfSubArray(arr); 

        System.out.println("The Maximum Product is - " + result);
    }
}
