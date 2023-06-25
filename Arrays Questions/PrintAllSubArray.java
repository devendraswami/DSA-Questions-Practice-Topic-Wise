public class PrintAllSubArray { 
 
    public static void printAllSubArrays( int arr[]) {

        for(int i = 0; i<arr.length; i++) {  
         
            for(int j = i; j<arr.length; j++ ) {
              System.out.print("{");
                for(int k = i; k<=j; k++) {
                    System.out.print(arr[k]  );
                } 
                System.out.print("}");
               System.out.println();
            }
        
        }
    }

    public static void main(String[] args) {
        // Question Print all the SubArray of the given array This is the Bruteforce Approach 

        int arr[] = {1,2,3,4,5}; 

        printAllSubArrays(arr); 
    }
    
}
