class BackTrackingBasics {

 public static void changeArray(int arr[] , int idx , int val)  {
     
    // Base case 
     if(idx == arr.length) { 
        printArray(arr);  
        return;
     }

    // Recursion 

    arr[idx] = val;
    changeArray(arr, idx+1, val+1);
    // BackTracking Wala Step 
    arr[idx] = arr[idx] - 2;

 } 

 public static void printArray(int arr[]) {

    for(int nums : arr) {
        System.out.print(nums + " ");
    } 
    System.out.println();
 }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1); 
        printArray(arr);
    }
}