class Solution:
    def isPalindrome(self, s: str) -> bool:
        newStr = ""
        for i in s:
            if i.isalnum() == True:
                newStr += i.lower()
        return newStr == newStr[::-1]
        