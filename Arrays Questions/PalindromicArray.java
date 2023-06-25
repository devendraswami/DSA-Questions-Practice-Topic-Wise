
class PalindromiArray {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,3,2,1};  
        int n = arr.length; 
        boolean flag = true; 

        for(int i = 0; i<n/2 ; i++ ) {
            if(arr[i] != arr[n-i-1]) {
                flag = false;  
                System.out.println("The given array is not a  Palindromic Array ");
                break;
                
            }

        }  
    if(flag ==true) {
        System.out.println("The Given array is an palindromic array ");
    }
        
                 
    }
}