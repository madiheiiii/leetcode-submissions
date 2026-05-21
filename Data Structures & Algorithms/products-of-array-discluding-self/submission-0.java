class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int lastIndex = nums.length - 1;
        prefix[0] = 1;  postfix[lastIndex] = 1;

        for (int i = 0; i < lastIndex; i++){
            prefix[i+1] = prefix[i] * nums[i];
            postfix[(lastIndex)-(i+1)] = postfix[lastIndex-i] * nums[lastIndex-i];
        }

        for (int i = 0; i < nums.length; i++){
            output[i] = prefix[i] * postfix[i];
        }
        return output;
    }
}  
