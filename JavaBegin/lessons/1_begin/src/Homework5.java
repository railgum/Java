import java.util.*;

public class Homework5 {
    public static void main(String[] args) {
        // Учитывая два целочисленных массива nums1 и nums2, верните максимальную длину подмассива,
        // который появляется в обоих массивах.
        //
        //Example 1:
        //Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
        //Output: 3
        //Explanation: Повторяющийся подмассив с максимальной длиной равен [3,2,1].
        //
        //Example 2:
        //Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
        //Output: 5
        //Explanation: Повторяющийся подмассив с максимальной длиной равен [0,0,0,0,0].
        
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};
        arrayRepeatValue(nums1,nums2);
    }

    public static ArrayList<Integer> arrayRepeatValue(int[] arr1, int[] arr2){
        List<Integer> res = new ArrayList<>();
        if (arr1.length>arr2.length){
            res = searchRepeatValue(arr1,arr2);
        }
        else res = searchRepeatValue(arr2,arr1);
        return (ArrayList<Integer>) res;
    }

    private static List<Integer> searchRepeatValue(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i]==arr1[j]){

                }
            }
        }
    }
}
