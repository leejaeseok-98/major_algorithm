//package A6twoPointer;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class A601TwoPointerBasic {
//    public static void main(String[] args) {
////        아래 배열에서 target이 될 수 있는 두수의 조합을 모두 찾아내어라
////        배열에는 중복된 수는 없다고 가정
//        int[] nums = {7,8,9,2,4,5,1,3,6};
//        int target = 10;
//
//        List<int[]> list = new ArrayList<>();
//        for (int i = 0;i< nums.length-1;i++){
//            for (int j = i+1; j< nums.length;j++){
//                if (target == nums[i] + nums[j]){
//                    list.add(new int[]{nums[i],nums[j]});
//                }
//            }
//        }
//        for (int[] a : list){
//            System.out.println(Arrays.toString(a));
//        }
////        투포인터를 활용한 조합찾기
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//
//        List<int []> mylist = new ArrayList<>();
//        int start = 0;
//        int end = nums.length-1;
//
//        for (int i = 0;i<nums.length;i++){
//            if (nums[start]+nums[end] == target){
//                mylist.add(new int[]{nums[start],nums[end]});
//                end--;
//            }
//
//        }
//
//
//    }
//}
