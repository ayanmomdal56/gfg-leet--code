import java.util.*;
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        

int n=cardPoints.length;
int lsum=0; 
int max=0;
for(int i=0;i<k;i++){
lsum=lsum+cardPoints[i];

}
max=lsum;


// int rsum=n-1;
int rsum=0;
int rindex=n-1;
for(int i=k-1;i>=0;i--){
lsum=lsum-cardPoints[i];
rsum=rsum+cardPoints[rindex];
rindex--;


max = Math.max(max, lsum + rsum);
            }

return max;

    }
}