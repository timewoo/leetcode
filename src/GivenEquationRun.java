import depend.CustomFunction;
import run.GivenEquation;

import java.util.List;

public class GivenEquationRun {

    public static void main(String[] args) {
        CustomFunction customFunction = new CustomFunction(1);
        GivenEquation givenEquation = new GivenEquation();
        List<List<Integer>> solution = givenEquation.findSolution(customFunction, 2);
        System.out.println(solution);
    }
}
