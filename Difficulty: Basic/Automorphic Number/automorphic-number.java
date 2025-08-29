// User function Template for Java

class Solution {
    public String is_AutomorphicNumber(int n) {


int y=n*n;
if(y%10 == n%10){
         return "Automorphic";
           }else{
               return "Not Automorphic";
}

    }
}