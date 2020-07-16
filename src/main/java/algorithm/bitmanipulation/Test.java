package algorithm.bitmanipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
//        int[] nums = {1, 3, 5, 4, 7};
//        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(hammingWeight(11));
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for(int i = 0; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

    public static int hammingWeight(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < 32; i ++) {
            if((n & b) == b){
                System.out.println("第" + i + "次，b=" + b);
                a++;
            }
            b <<= 1;
        }

        return a;
    }
}
