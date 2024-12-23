package A1sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class A102명예의전당 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];
        int min = 999;
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0;i< score.length;i++){
            if (pq.size() < k){
                pq.add(score[i]);
                if (score[i] < min){
                    min = score[i];
                }
                if (pq.contains(min)){
                    answer[i] = min;
                }
            } else if (pq.size()==k) {
                if (score[i] > pq.peek()){
                    pq.poll();
                    pq.add(i);
                    min = pq.peek();
                    if (pq.contains(min)){
                        answer[i] = min;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        
//        for (int i : score) {
//            if (pq.size()<=k){
//                pq.add(i);
//                if (min > pq.peek()){
//                    answer[]
//                }
//            }
//        }
    }
}

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        return answer;
    }
}