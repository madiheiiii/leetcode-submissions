class Solution:
    def search(self, nums: List[int], target: int) -> int:
        start = 0
        final = len(nums) - 1
        while start <= final:
            m = start + ((final - start) // 2)
            if target > nums[m]:
                start = m+1
            elif target < nums[m]:
                final = m -1 
            else:
                 return m

        return -1;

