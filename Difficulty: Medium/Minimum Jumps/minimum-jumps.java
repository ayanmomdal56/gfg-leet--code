class Solution {
    static int minJumps(int[] arr) {
        if(arr.length==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int jump=1;
        int max=arr[0];
        int steps=arr[0];
        for(int i=1;i<arr.length;i++){
            if(i==arr.length-1){
                return jump;
            }
            if(arr[i]+i>max){
                max =arr[i]+i;
            }
            if(max<=i){
                return -1;
            }
            steps--;
            if(steps==0){
                steps = max-i;
                jump++;
            }
        }
        return -1;
    }
}