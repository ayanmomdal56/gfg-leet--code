class Solution {
    public int maxScore(int[] cardPoints, int k) {


int rsum=0;
int lsum=0;
int maxsum=0;
int maxsum2=0;

for(int i=0;i<k;i++){
    lsum=lsum+cardPoints[i];
}
    maxsum=lsum;



int n=cardPoints.length-1;
for(int i=k-1;i>=0;i--){
lsum-=cardPoints[i];
// rsum+=cardPoints[n - (k - i) + 1];
rsum+= cardPoints[n];
            n--;
            maxsum=Math.max(maxsum, lsum + rsum);

}
// return Math.max(maxsum, lsum,maxsum2);
return maxsum;

        
    }
}