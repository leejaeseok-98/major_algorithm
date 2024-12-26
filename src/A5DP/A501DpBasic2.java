//package A5DP;
//
//public class A501DpBasic2 {
////        greedy : 현재로서 최적의 해를 선택했을 때, 전체의 최적의 해를 보장하는 알고리즘
//    public static void main(String[] args) {
////        1,4,5로 13을 만들 수 있는 조합 중 가장 짧은 조합의 길이
////        greedy로 풀 경우 : 5개(5*2 + (1+3)
////        dfs, bfs로 풀경우 일반적으로 시간초과나도록 설계
//
////        dp로 풀 경우 : 3개(4*2 + 5*1)
//
////        점화식
////        룰찾기
//
//        int target = 13;
//        int[] numbers = {1,4,5};
//        int[] arr = new int[(target+1)];
//        arr[1] = 1;
//
//        for (int i = 2; i < arr.length;i++){
//            int min = Integer.MIN_VALUE;
//            for ( N : numbers){
//                if (abc[i] == numbers[i] + numbers[j]){
//                    cnt++;
//                } else if (abc[abc.length] == numbers[i] + numbers[j]) {
//                    cnt++;
//                }
//            }
//            count = cnt;
//        }
//
//
//    }
//}
