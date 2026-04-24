class Solution:
    def isPalindrome(self, s: str) -> bool:
        i=0
        s=s.replace(" ","")
        s=re.sub(r'[^a-zA-Z0-9]', '', s)
        s=s.upper()
        j=len(s)-1
        while j>i:
            if s[i]!=s[j]:
                return False
            i+=1
            j-=1
        return True 