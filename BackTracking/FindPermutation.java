 import java.util.*;

class FindPermutation {

    public static List<List<Integer>> findPermute(int arr[]) {
        
        List<List<Integer>> result = new ArrayList<>(); 
        
        // to find the all permutation lets create a new BackTracking method 
        
        backTrackingHelper(result, new ArrayList<>(), arr);

        return result; 
        

    } 

    private static void backTrackingHelper(List<List<Integer>> result, ArrayList<Integer> tempList, int[] arr) { 
       
        if(tempList.size() == arr.length) {
            result.add(new ArrayList(tempList));
            
            return; 
        }
        
        for(int nums : arr) { 
           if(tempList.contains(nums)) {
            continue;
           }

            tempList.add(nums); 

            // Now lets call for other elements 

            backTrackingHelper(result, tempList, arr); 

            tempList.remove(tempList.size() - 1); 

            
        }
    }

    

    
    public static void main(String[] args) {
         
     int arr[] = {1,2,3}; 
    
     List<List<Integer>> result = findPermute(arr);

     System.out.println(result);

    }
}