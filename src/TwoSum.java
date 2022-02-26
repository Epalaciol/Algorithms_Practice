import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) throws Exception {
        // add Test cases
    }

    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> sums = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(sums.containsKey(complement)){                
                return new int[]{sums.get(complement), i};               
            }
            sums.put(nums[i], i);
            
        }
        
        return null;
    }
}