public class FirstOccurence {  

    public static int FirstOccurenceInArray(int arr[] , int target) {
       int n = arr.length; 
        int low = 0; int high = n-1; 
        int result = -1; 
          

         while(low<=high) {
               int mid = (low + high)/2; 
                
               if(arr[mid] == target) { 
                   result = mid; 
                   high = mid-1; 
               } else if(arr[mid] > target ) {
                
                  high = mid-1; 
               } else {
                low = mid+1; 
               }
         }
             
         return result; 

    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,7,8,9}; 
        int target = 7; 

        // Function Calling 
        
         int result = FirstOccurenceInArray(arr, target); 

         if(result != -1) {
            System.out.println("The First Occurence of an element is at index  " + result );
         } else {
            System.out.println("Element not found ");
         }
      
    }
    
}
