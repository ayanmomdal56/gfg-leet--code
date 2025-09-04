// User function Template for Java

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        ArrayList<Integer>l = new ArrayList<Integer>();
        int mid = arr.length/2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr,mid, arr.length);
        for(int i=0; i<mid; i++){
            l.add(arr[i]);
        }
         for(int i=arr.length-1; i>=mid; i--){
            l.add(arr[i]);
        }
        return l;
    }
    
}