
class BinarySearch { 
 
    public static int serchAlgorithm(int arr[] , int target) {
     
         int n = arr.length; 
        int low = 0; int high = n-1; 
          

         while(low<=high) {
               int mid = (low + high)/2; 
                
               if(arr[mid] == target) { 
              
                   return mid; 
               } else if(arr[mid] > target ) {
                
                  high = mid-1; 
               } else {
                low = mid+1; 
               }
         }
             
         return 0; 

    }

    public static void main(String[] args) {
        
        int arr[] = {0,1,2,3,5,6,7,8,9,10}; 
        
        int element = 10; 

        // Function Calling 

         int result = serchAlgorithm(arr, element); 

         if(result != 0) {
            System.out.println("The Element in present at index " + result);
         } else {
            System.out.println("The Element is not present in the array ");
         }


    }
}