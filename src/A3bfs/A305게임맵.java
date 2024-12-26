package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

public class A305게임맵 {
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},
                        {1,0,1,0,1},
                        {1,0,1,1,1},
                        {1,1,1,0,1},
                        {0,0,0,0,1}};
        int answer = 0;

        int[] x = {-1,1,0,0};
        int[] y = {0,0,-1,1};

        boolean[][] visited = new boolean[maps.length][maps[0].length];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        while (!queue.isEmpty()){
            int[] temp = queue.poll();
            int ax = temp[0];
            int ay = temp[1];

            for (int i = 0;i<x.length;i++){
                int nx = ax + x[i];
                int ny = ay+ y[i];

                if (nx >=0 && ny>=0 && nx < maps.length && ny< maps[0].length){
                    if (maps[ny][nx] == 1 && !visited[ny][nx]){
                        visited[ny][nx] = true;
                        queue.add(new int[]{ny,nx});
                        answer++;
                    }
//                    if (maps[ny][nx])
                }
            }
        }
        System.out.println(answer);
    }
}
