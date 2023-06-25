import java.util.Scanner;

class FactorialFind { 
    // Function Defenition 

    public static long FactFind(int n ) {
        long result ;  

        // Base Case 
        if(n == 1 || n == 0) {
          return 1; 
        } 
        // Recursive Call 
        result = n*FactFind(n-1);

        return result;
    }




    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in); 
         System.out.println("Entre the number of which you want to find Factorial : "); 

         int n = scan.nextInt(); 

         // Function Calling 
         long res = FactFind(n); 
         System.out.println("The Factorial of given numbers is : " + res);
     
    }
 }