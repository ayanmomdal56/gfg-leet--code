class Solution {
    public int getSecondLargest(int[] arr) {

int lar=arr[0];
int slar=-1;

for(int i=1;i<arr.length;i++){
    
    
    if(arr[i]>lar){
        slar=lar;
        lar=arr[i];
    }
    
    if(arr[i]<lar && arr[i]>slar){
        slar=arr[i];
    }
}

return slar;

    }
}