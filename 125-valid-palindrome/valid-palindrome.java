class Solution {
    public boolean isPalindrome(String s) {
        int c=0;
      String str =s.toLowerCase();
        String st =str.replaceAll("[^a-zA-Z0-9]", "");
         if (st.isEmpty()) {
            return true;
        }

        while (c<st.length()){
   for(int i=st.length()-1;i>=0;i--)
   {
   if (st.charAt(i)!=st.charAt(c)) {
                return false;
            }
            c++;
           
        }
        }
        return true;
    }
    }