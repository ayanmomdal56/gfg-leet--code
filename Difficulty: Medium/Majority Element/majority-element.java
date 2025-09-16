import java.util.*;
class Solution 
{
    int majorityElement(int arr[]) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int num : arr) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2)
            return num; 
        }
        return -1;
    }
}
