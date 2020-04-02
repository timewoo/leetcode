import run.SmallerNumber;

import java.util.Arrays;

/**
 * @author yanglin
 * @date 2020/4/2 15:52
 */
public class SmallerNumberRun {

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        SmallerNumber smallerNumber = new SmallerNumber();
        System.out.println(Arrays.toString(smallerNumber.smallerNumbersThanCurrent(nums)));
    }
}
