package A3bfs;

import java.util.*;

public class 숨바꼭질 {
    public static int bfs(int n, int k) {
        int maxPosition = 100000;
        int[] visited = new int[maxPosition + 1];
        Arrays.fill(visited, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // K 위치에 도달하면 최단 시간 반환
            if (current == k) {
                return visited[current];
            }

            // 이동 가능한 위치 계산
            for (int next : new int[]{current - 1, current + 1, current * 2}) {
                if (next >= 0 && next <= maxPosition && visited[next] == -1) {
                    visited[next] = visited[current] + 1;
                    queue.add(next);
                }
            }
        }
        return -1; // 이론상 도달 불가한 경우
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(bfs(n, k));
    }
}
