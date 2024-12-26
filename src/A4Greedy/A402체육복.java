package A4Greedy;


import java.util.Arrays;

public class A402체육복 {
    public static void main(String[] args) {
        int n =5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

//        수업을 들을 수 있는 학생 수
//        수업을 들을 수 있는 학생의 수의 유형은
//        여벌옷이 있는 학생, 도난 당했지만 옷을 빌린 학생, 여벌옷이 있지만 도난당한 학생
//        전체학생 - (도난 당한 학생)

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n - lost.length;
//        여벌옷이 있지만 도난 당한 학생
        for (int i =0; i< lost.length;i++){
            for (int j = 0; j< reserve.length;j++){
                if (lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

//        옷을 빌려받아 수업에 참가할 수 있는 학생
        for (int i = 0; i < lost.length;i++){
            for (int j = 0; j < reserve.length;j++){
                if (reserve[j] -1 == lost[i] || reserve[j] +1 == lost[i]){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

    }
}
