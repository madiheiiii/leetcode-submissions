class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        nums = 0
        res = ""
        for i in s:
            if i in res:
                index = res.find(i)
                res = res[index+1:]
            res+=i
            nums = max(nums, len(res))
        return nums
