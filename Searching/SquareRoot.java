public class SquareRoot {  

    public static int  squrRoot(int num ) {

        int low = 0; 
        int high = num; 
         int result = -1; 
           

         while(low<=high) {
            
           int mid = low+ (high-low)/2;   
           int val = mid*mid; 
           
           if(val == num) {
            return mid; 
           } else if(val<num) {
            result = mid; 
             low = mid+1; 
           } else {
                 
             high = mid-1; 
           }


         }


         return result; 
        
    }

    public static void main(String[] args) {
        
        int nm = 27; 
        int result = squrRoot(nm); 

        System.out.println("The Square Root of given number is : " + result);

    }
    
}
 
