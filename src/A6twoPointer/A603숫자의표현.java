package A6twoPointer;

import java.util.ArrayList;
import java.util.List;

public class A603숫자의표현 {
    public static void main(String[] args) {
        int n = 15; //target
        int start = 0;
        int end = 0;
        int total = 0;
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = i+1;
        }
        List<int[]> list = new ArrayList<>();

        while (start < end && end < arr.length){
            if (total == n){
                list.add(new int[]{start,end});
                total -= arr[start];
                start++;
            } else if (total > n) {
                total -= arr[start];

                
            } else if (total < n) {
                
            }
        }

    }
}
