class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> newNums = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            newNums.put(nums[i], i);
        }
        for (int i = 0; i<nums.length; i++){
            if(newNums.get(nums[i]) != i){
                return true;
            }
        }
        return false;
    }
}