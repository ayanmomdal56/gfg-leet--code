class Solution {
    int convertfive(int num) {
      String str= String.valueOf(num);
      
      str=str.replace('0','5');
      
      
      return Integer.parseInt(str);
        
    }
}