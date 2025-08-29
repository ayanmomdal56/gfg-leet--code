// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
int r=0;
int d=0;
int temp;
temp=n;
while(temp!=0){

 d=temp%10;
  r += d *d*d;  
  temp=temp/10;

    }

    boolean flag=r==n?true:false;
    return flag;    }
}