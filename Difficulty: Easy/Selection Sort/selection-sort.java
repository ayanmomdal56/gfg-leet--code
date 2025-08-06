class Solution {
    void selectionSort(int[] arr) {

        for (int i=0;i<arr.length-1;i++) {
            int last=arr.length- i - 1;
            int index =0;

            for (int j=1;j<=last;j++) {
                if (arr[j]>arr[index]) {
                    index=j;
                }
            }

            int temp=arr[index];
            arr[index]=arr[last];
            arr[last]=temp;
        }
    }
}
