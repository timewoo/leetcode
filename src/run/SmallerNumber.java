package run;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yanglin
 * @date 2020/4/2 15:34
 */
public class SmallerNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        int[] array = new int[nums.length];
//        int[] contain = Arrays.copyOfRange(nums,0,nums.length);
//        Arrays.sort(contain);
//        List list = Arrays.stream(contain).boxed().collect(Collectors.toList());
//        for (int i = 0; i < list.size(); i++) {
//            Object o = list.get(i);
//            if (i!=0){
//                Object o1 = list.get(i - 1);
//                if (o!=o1){
//                    map.put((Integer) o,i);
//                }
//            }else {
//                map.put((Integer) o,i);
//            }
//
//        }
//        for (int i=0;i<nums.length;i++){
//            if (map.containsKey(nums[i])){
//                array[i]=map.get(nums[i]);
//            }
//        }
//        return array;
        // 推荐算法
        int[] count = new int[101];
        int[] res = new int[nums.length];
        // 记录每个数字出现的次数,类似排序
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        // 记录比每个数字小的数字的个数(比实际多一个)
        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];
        }
        // 获取比每个数字小的个数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = count[nums[i] - 1];
            }
        }

        return res;
    }
}
