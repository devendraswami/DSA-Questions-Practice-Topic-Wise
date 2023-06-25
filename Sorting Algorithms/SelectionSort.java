public class SelectionSort {
    
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,2,1};

        // in every iteration we take the smallest element and move to first
        // one iteration and one swap 

        for(int i = 0; i<arr.length-1; i++) {
            int smallest = i; 
            for(int j = i+1; j<arr.length; j++) {
              if(arr[smallest] >arr[j]) {
                int temp = arr[j]; 
                 arr[j] = arr[smallest]; 
                 arr[smallest] = temp; 

              }      

           }
        } 

        // print the sorted array 
        for(int e : arr) {
            System.out.print(e + " ");
        }
    }
}
