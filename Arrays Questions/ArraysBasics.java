import java.util.Scanner;

public class ArraysBasics { 

    public static void main(String[] args) {
        /*We will take an array as an input from the user and search for an element 
         * in the arrays if it is present or not . 
         */ 

         Scanner scan = new Scanner(System.in); 
         System.out.println("Entre the size of array : "); 

         int size = scan.nextInt(); 

         int arr[] = new int[size]; 

        System.out.println("Entre the elements of arrays : "); 
        
        for(int i = 0; i<arr.length; i++) {
            arr[i] = scan.nextInt(); 
        } 

        System.out.println("Entre the element You want to search in the array : "); 

        int num = scan.nextInt(); 
          
        boolean flag = false; 
          
        // Linear search 
        
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == num) {
                System.out.println("Element is present at index " + i); 
                flag = true; 
            }
        } 

        if(flag != true) {
            System.out.println("Element is not present in the given array ");
        }
    }
    
}
