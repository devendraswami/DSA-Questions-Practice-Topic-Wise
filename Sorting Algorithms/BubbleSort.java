 
public class BubbleSort { 
    // In Bubble sort we move bigger elements one by one at last 
    // s.c - O(1)
    // Time complexity of bubble sort is high so this is not a good sorting algorithm - o(n)
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,2,1}; 
        
       for(int i = 0; i<arr.length; i++) {
        for(int j =0; j<arr.length-i-1; j++ ) { // every time bigger element will be sorted to last 
                
            if(arr[j]>arr[j+1]) {
                // Swap 
                int temp = arr[j]; 
                 arr[j] = arr[j+1]; 
                 arr[j+1] = temp; 
            }
    

        }
       } 

       // Print sorted array 
       for(int e : arr) {
        System.out.print(e + " ");
       }
    }
}
