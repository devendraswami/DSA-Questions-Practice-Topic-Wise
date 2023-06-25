public class TwoSumBruteForce { 
// Bruteforce Approach  


 
public static int[] findTwoSum(int arr[] , int targert) {
 

    int nums[] = new int[2]; 
      
   for(int i = 0; i<arr.length; i++) {
    for(int j = i+1 ; j<arr.length; j++) {

        if(arr[i] + arr[j] == targert)  {
           
            
           nums[0] = i; 
           nums[1] = j; 
           return nums;  
           
           
        }           
    } 
    
   }

   
     return nums; 

}

    public static void main(String[] args) {
        
        int arr[] = {1,4,6,5,7}; 
        int targert = 9; 

        int result[] = findTwoSum(arr, targert);  

        for(int i = 0; i<result.length; i++) {
            System.out.print("The indices are : "+result[i] + " ");
        }

    }
    
}
