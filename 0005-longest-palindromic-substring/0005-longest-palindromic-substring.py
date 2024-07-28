class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) < 2:
            return s
        res = ""
        resultLen = 0
        for i in range(len(s)):
            #odd 
            l,r = i,i
            print(l,r)
            while(l>=0 and r<len(s) and s[l]==s[r]):
                if (r-l+1)>resultLen:
                    print(r-l+1)
                    resultLen = r-l+1
                    res = s[l:r+1]
                l-=1
                r+=1

                #even 
            l,r = i,i+1
            print(l,r)
            while(l>=0 and r<len(s) and s[l]==s[r]):
                if (r-l+1)>resultLen:
                    print(r-l+1)
                    resultLen = r-l+1
                    res = s[l:r+1]
                l-=1
                r+=1
        return res
            

    #     for i in range(len(s)-1):
    #         result = max(result, self.helper(s, i, i), self.helper(s, i, i+1), key=len)
    #     return result

    # def helper(self, s, left, right):
    #     while left >= 0 and right < len(s) and s[left] == s[right]:
    #         left -= 1
    #         right += 1
    #     return s[left+1:right]