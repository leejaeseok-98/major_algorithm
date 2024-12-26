package A4Greedy;

import java.util.*;
import java.util.stream.IntStream;

public class A403구명보트 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int answer = 0;

        Arrays.sort(people);

        Deque<Integer> deque = new LinkedList<>();
        while (!deque.isEmpty()){
            if (deque.getFirst() + deque.getLast() <= limit){
                deque.removeFirst();
                deque.pollLast();
                answer += 1;
            } else {
                deque.removeFirst();
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
