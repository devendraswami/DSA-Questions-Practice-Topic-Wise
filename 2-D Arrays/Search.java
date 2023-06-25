import java.util.Scanner;

class Search {  

    

    public static void main(String[] args) {
        
        // we to take 2 D array as an input from the user and search for the given element and return its indices 

        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Entre the number of rows : "); 
        int rows = scan.nextInt(); 

        System.out.println("Entre the number of coloms : ");  
        int cols = scan.nextInt(); 

      int[][] numbers = new int[rows][cols]; 
      System.out.println("Entre the Array: " );
      for(int i = 0; i<rows; i++) {
        for(int j = 0; j<cols; j++) {
            numbers[i][j] = scan.nextInt();
        }
      } 

      System.out.println("Entre the element You want to search in array : "); 

      int target = scan.nextInt(); 
      
      boolean flag = false; 

     for(int i = 0; i<rows; i++) {
        for(int j = 0; j<cols; j++) {
            if(numbers[i][j] == target) {
                System.out.print("The location of the element is : " + i +"," + j); 
                flag = true; 
            }
        } 
        System.out.println();
     }
    
     if(flag != true) {
         System.out.println("Element not found");
     }
        
     // Output  
     System.out.println("The Arrays is : ");

     for(int i = 0; i<rows; i++) {
        for(int j = 0; j<cols; j++) {
            System.out.print(numbers[i][j] + " ");
        } 
        System.out.println();
     }

    }

}