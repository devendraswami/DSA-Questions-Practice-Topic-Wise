import java.util.Scanner;

public class FibonacciSeries {
    
//  Function Defenition 

 public static int FibFind(int n) {
     
    int result ; 
    // Base case 
      if(n<=1) {
        return n; 
      }  
      result = FibFind(n-1)+FibFind(n-2); 

      return result; 

 }



    public static void main(String[] args) {
        
        // we have to find the nth of Fibnacci series 
        Scanner scan = new Scanner(System.in); 
        System.out.println("Entre n : ");
        int n  = scan.nextInt(); 

        int result = FibFind(n); 
        System.out.println("The nth of the fibnacci series is : " + result);
        
        

    }
}
