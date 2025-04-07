class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n= grid.length;
        int total=n*n;
          int[] count = new int[total + 1];

          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
          }
        int r=-1;
        int m=-1;


       for (int i = 1; i <= total; i++) {
            if (count[i]==2) {
                r= i;
            } else if (count[i] == 0) {
                m = i;
            }
        
       }
        return new int[]{r, m};
       
    }
}