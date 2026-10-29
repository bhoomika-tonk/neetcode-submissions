class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            int sum = target - nums[i];
            if(mp.containsKey(sum) && mp.get(sum) != i){
                return new int[] {i,mp.get(sum)};
            }
        }
        
        return new int[0];
    }
}

