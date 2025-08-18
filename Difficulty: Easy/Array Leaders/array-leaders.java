class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

ArrayList<Integer> set = new ArrayList<>();

int  n =arr.length;

int max=arr[n-1];
set.add(max);


for(int i=n-2;i>=0;i--){
    if(arr[i]>=max){
        max=arr[i];
        set.add(max);
    }
    }
    Collections.reverse(set);
    return set;


    }
}
