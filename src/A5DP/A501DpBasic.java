package A5DP;

import java.util.Arrays;

public class A501DpBasic {
//        greedy : 현재로서 최적의 해를 선택했을 때, 전체의 최적의 해를 보장하는 알고리즘
    public static void main(String[] args) {
//        1,4,5로 13을 만들 수 있는 조합 중 가장 짧은 조합의 길이
//        greedy로 풀 경우 : 5개(5*2 + (1+3)
//        dfs, bfs로 풀경우 일반적으로 시간초과나도록 설계

//        dp로 풀 경우 : 3개(4*2 + 5*1)

//        점화식
//        룰찾기

        int target = 13;
        int[] numbers = {1,4,5};
        int[] abc = new int[3];
        int count =0;

        for (int i = 0; i< numbers.length;i++){
            abc[i] = target - numbers[i];
        }
        for (int i = 0; i < numbers.length-1;i++){
            int cnt = 0;
            for (int j = i+1; j< numbers.length;j++){
                if (abc[i] == numbers[i] + numbers[j]){
                    cnt++;
                } else if (abc[abc.length] == numbers[i] + numbers[j]) {
                    cnt++;
                }
            }
            count = cnt;
        }


    }
}
