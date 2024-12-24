package A1sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class A101HeapSort구현복습 {
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1,6};
        for (int i = arr.length/2-1;i>=0;i--){
            heapify(arr,i,arr.length);
        }

        for (int i = arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,0,i);
        }

        int[] newArr = new int[arr.length];
        Queue<Integer> pq = new PriorityQueue<>();



    }
    private static void heapify(int[] arr, int parent, int len){
//      부모노드에서 자식노드의 인덱스를 알아보는 방법
        int left = parent*2+1;
        int right = parent*2+2;

        if (left > len) return;
        if (right > len){
            if (arr[parent] > arr[left]){
                int temp = arr[parent];
                arr[parent] = arr[left];
                arr[left] = temp;
                heapify(arr,left,len);
            }
        }
        else {
            int index = 0;
            if (arr[parent] > arr[left] || arr[parent] > arr[right]){
                if (arr[left] > arr[right]){
                    index = right;
                } else {
                    index = left;
                }
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                heapify(arr,index,len);
            }
        }
    }
}
