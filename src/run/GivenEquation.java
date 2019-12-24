package run;

import depend.CustomFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yanglin
 * @date 2019/12/24
 */
public class GivenEquation {

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        int x = 1, y = 1000;
        while (x <= 1000 && y > 0) {
            int v = customfunction.f(x, y);
            if (v > z) {
                --y;
            } else if (v < z) {
                ++x;
            } else {
                res.add(Arrays.asList(x++, y--));
            }
        }
        return res;
    }
}
