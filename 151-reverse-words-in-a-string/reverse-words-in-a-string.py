class Solution(object):
    def reverseWords(self,s):
        word = s.split()
        rev = word[::-1]
        rev_word = ''+join(rev)
        return rev_word
        