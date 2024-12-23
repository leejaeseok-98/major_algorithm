package A1sort;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class A103야근지수 {
    public static void main(String[] args) {
        int n = 4;
        int[] works = {4,3,3};
        long answer = 0L;
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int work : works) {
            pq.add(work);
        }
        while (n>0){
            int work = pq.poll();
            if (work == 0) break;
            work -= 1;
            pq.add(work);
            n -= 1;
        }
        System.out.println();
        for (int i = 0; i < works.length;i++){
            int a = pq.poll();
            answer += (long) a *a;
        }
        System.out.println(answer);
    }
}
