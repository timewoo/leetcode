package depend;

/**
 * @author yanglin
 * @date 2019/12/24
 */
public class CustomFunction {

    private int function_id;

    public CustomFunction(int input){
        function_id = input;
    }

    /**
     * f(x, y) < f(x + 1, y)
     * f(x, y) < f(x, y + 1)
     * @param x
     * @param y
     * @return
     */
    public int f(int x,int y){
        if (function_id==1){
            return x+y;
        }else {
            return x*y;
        }
    }

}
