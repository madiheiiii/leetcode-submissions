class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] twoInt = new int[2];

        for (int i = 0; i <= nums.length - 1; i++){
            map.put(nums[i], i);
        }
        
        for(int i = nums.length - 1; i >= 0; i--){
            int diff = target - nums[i];
            if (map.containsKey(diff)){
                if(i != map.get(diff)){
                    twoInt[0] = i;
                    twoInt[1] = map.get(diff);
                }
            }
        }
        return twoInt;
    }
}
