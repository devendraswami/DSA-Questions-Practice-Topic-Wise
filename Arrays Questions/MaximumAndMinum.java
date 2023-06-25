import java.util.Scanner;

class MaximumAndMinum {
    public static void main(String[] args) {
        
      

     
      // Take array as input 

         Scanner scan = new Scanner(System.in); 
         System.out.println("Entre the size of array : "); 

         int size = scan.nextInt(); 

         int arr[] = new int[size]; 

        System.out.println("Entre the elements of arrays : "); 
        
        for(int i = 0; i<arr.length; i++) {
            arr[i] = scan.nextInt(); 
        }  

         int max  = Integer.MIN_VALUE;  
         int min = Integer.MAX_VALUE;  

         for(int i = 0; i< arr.length; i++ ) {
              
            if(arr[i] > max) {
                max = arr[i]; 
            } 
            if(arr[i] < min) {
                min = arr[i]; 
            }
            
         }
 
         System.out.println("The Maximum Element in the Given arrays is : " + max); 
         System.out.println("The Minmum Element in the Given array is : " + min);

    }
}