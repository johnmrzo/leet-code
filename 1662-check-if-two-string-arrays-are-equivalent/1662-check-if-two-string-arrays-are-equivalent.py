class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        word1Combined = ""
        for w in word1:
            word1Combined += w
            
        word2Combined = ""
        for w in word2:
            word2Combined += w
            
        return word1Combined == word2Combined
        
        