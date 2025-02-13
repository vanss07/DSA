//leetcode solution
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>(); 
        int index = 0; 
        
        for (int num : nums) { 
            int complement = target - num; 
            
            if (numMap.containsKey(complement)) { 
                return new int[]{numMap.get(complement), index};
            }
            
            numMap.put(num, index); 
            index++; 
        }
        
        return new int[]{};
    }
}
