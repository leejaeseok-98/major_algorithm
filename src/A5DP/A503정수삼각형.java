package A5DP;

public class A503정수삼각형 {
    public static void main(String[] args) {
        int[][] triangle = {{7},
                            {3, 8},
                            {8, 1, 0},
                            {2, 7, 4, 4},
                            {4, 5, 2, 6, 5}};

        for (int i = 1; i< triangle.length;i++){
            triangle[i][0] = triangle[i][0] + triangle[i-1][0];
            triangle[i][triangle.length-1] = triangle[i][triangle.length-1] + triangle[i-1][triangle.length-1];
        }
//
        for (int i = 1; i < triangle.length; i++){
            for (int j = 0; j < triangle[i].length;j++){

            }
        }


    }
}
