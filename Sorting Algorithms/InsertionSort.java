
class InsertionSort {
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,2,1}; 

        for(int i = 1; i<arr.length; i++) { 
             int j = i;  
             while(j>0 && arr[j]<arr[j-1]) {
                 int temp = arr[j]; 
                  arr[j] = arr[j-1]; 
                 arr[j-1] = temp;   
                 j--;       

                
             }

           } 

           // print array 
           for(int e : arr) {
            System.out.print(e + " ");
           }
    }
}