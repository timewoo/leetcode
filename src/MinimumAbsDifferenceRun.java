import run.MinimumAbsDifference;

import java.util.List;

/**
 * @author yanglin
 * @date 2020/1/2
 */
public class MinimumAbsDifferenceRun {

    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        MinimumAbsDifference minimumAbsDifference = new MinimumAbsDifference();
        List<List<Integer>> lists = minimumAbsDifference.minimumAbsDifference(arr);
        System.out.println(lists);
    }
}
