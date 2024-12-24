package A2dfs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A201Dfs1Basic1 {

    public static void main(String[] args) {
//        방문할수 있는 정점이여러개인 경우, 정점번호가 작은것을 먼저 방문
//        dfs알고리즘 형식의 방문순서를 출력, 출발은 0부터
        int[][] edge = {{0,1},{0,2},{1,3},{2,3},{2,4}};
//        dfs로 방문시 0-1-3-2-4
//        관계성을 어떻게 짤것인가
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0;i<5;i++){
            adjList.add(new ArrayList<>());
        }

        for (int[] a : edge){
            adjList.get(a[0]).add(a[1]);
    //        양방향일 경우
            adjList.get(a[1]).add(a[0]);
        }
        System.out.println(adjList);

//        정점번호가 작은것부터 방문하기 위한 정렬
        for (int i = 0; i< adjList.size();i++){
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        boolean[] visit = new boolean[adjList.size()];

        dfs(adjList,0, visit);
    }
    static void dfs(List<List<Integer>> adjList, int start, boolean[] visit){
        System.out.println(start);
        visit[start] = true;
        for (int a : adjList.get(start))
         if (!visit[a]){
             dfs(adjList, a, visit);
         }
    }
}
