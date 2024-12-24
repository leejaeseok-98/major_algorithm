package A3bfs;

import java.util.*;

public class A304가장먼노드 {
    public static void main(String[] args) {
        int[][] edge = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
        int n = 6;

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i< n+1;i++){
            adjList.add(new ArrayList<>());
        }
        for (int[] a : edge) {
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }
//        System.out.println(adjList);
        for (List<Integer> a : adjList) {
            a.sort(Comparator.naturalOrder());
        }
//        System.out.println(adjList);

        boolean[] visited = new boolean[n+1];
        int[] distance = new int[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            for (Integer target : adjList.get(temp)) {
                if (!visited[target]){
                    queue.add(target);
                    visited[target] = true;
                    distance[target] = distance[temp]+1;
                    queue.add(target);
                }
            }
        }
        int maxDistance = 0;
        int count =0;
        for (int a : distance){
            if (a > maxDistance){
                maxDistance = a;
                count = 1;
            } else if (a == maxDistance) {
                count++;
            }
        }
    }
}
