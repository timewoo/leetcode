import run.TargetArray;

import java.util.Arrays;

/**
 * @author yanglin
 * @date 2020/4/8 18:42
 */
public class TargetArrayRun {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        TargetArray targetArray = new TargetArray();
        System.out.println(Arrays.toString(targetArray.createTargetArray(nums,index)));
    }
}
