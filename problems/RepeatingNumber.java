import java.util.*;

public class RepeatingNumber {
    public static int firstRepeatingNumber(int[] nums){
        // 関数を完成させてください
        HashMap <Integer, Integer> hashMap = new HashMap<>();
        int result = -1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if(hashMap.containsKey(nums[i])) result = i;
            else hashMap.put(nums[i], 1);
        }

        if(result != -1) return nums[result];
        else return -1;
    }

    public static void main(String[] args) {
        int[] num = {1,5,3,4,3,1,6};
        int[] numB = {11,45,32,75,88,15,15};
        System.out.println(firstRepeatingNumber(num));
        System.out.println(firstRepeatingNumber(numB));
    }
}
