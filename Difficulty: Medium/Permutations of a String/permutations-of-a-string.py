#User function Template for python3
from itertools import permutations

class Solution:
    def findPermutation(self, s):
        unique_perms = set(permutations(s))
        
        return [''.join(p) for p in unique_perms]



