class Solution(object):
    def reverseVowels(self, s):
        vow = "aeiouAEIOU"
        s_list = list(s)
        i = 0
        j = len(s) - 1
    
        while i < j:
            if s_list[i] not in vow:
                i += 1
            elif s_list[j] not in vow:
                j -= 1
            else:
                s_list[i], s_list[j] = s_list[j], s_list[i]
                i += 1
                j -= 1
    
        return ''.join(s_list)
        
        