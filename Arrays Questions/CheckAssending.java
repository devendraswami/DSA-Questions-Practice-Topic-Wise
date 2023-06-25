import java.util.Scanner;

// Check Arrays is in sorted order or not 
public class CheckAssending { 

    public static void main(String[] args) {
        
        // Array input 

        
         Scanner scan = new Scanner(System.in); 
         System.out.println("Entre the size of array : "); 

         int size = scan.nextInt(); 

         int arr[] = new int[size]; 

        System.out.println("Entre the elements of arrays : "); 
        
        for(int i = 0; i<arr.length; i++) {
            arr[i] = scan.nextInt(); 
        }  

         boolean isAscending = true; 

         for(int i = 0; i< arr.length-1; i++ ) {

            if(arr[i] > arr[i+1] ) {
                isAscending= false; 
                break; 
            }
         } 

         if(isAscending) {
            System.out.println("The Given Arrays is  sorted in Ascending Order ");
         } else { 
            System.out.println("The Given Array is not sorted in Ascending Order ");
         }

    }
    
}
