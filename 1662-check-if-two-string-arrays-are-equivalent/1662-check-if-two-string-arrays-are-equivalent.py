class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        w1 = ""
        for w in word1:
            w1 += w
            
        w2 = ""
        for w in word2:
            w2 += w
            
        return w1 == w2
        
        