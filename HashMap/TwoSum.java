import java.util.HashMap;
import java.util.Map;

public class TwoSum {

   public static int[] twoSum(int arr[], int target) {

    HashMap<Integer, Integer> map = new HashMap<>(); 
    
    // First lets put keys(nums) and values(index) in the hashMap from given array 

    for(int i =0 ; i<arr.length; i++) {
        
        map.put(arr[i],i);
    } 

    // Now lets iterate through the array 

    for(int i = 0; i< arr.length; i++) {
        
        int dif = target - arr[i];    



          if(map.containsKey(dif)) { 

            int index = map.get(dif); 
            if(index == i) {continue;}
            return new int[]{i,index};
          }
    } 

    return new int[]{};

   }

  

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] indices = twoSum(nums, target);

        if (indices.length == 2) {
            System.out.println("Indices: " + indices[0] + ", " + indices[1]);
            System.out.println("Numbers: " + nums[indices[0]] + ", " + nums[indices[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
