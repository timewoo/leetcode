package run;

import java.util.Arrays;

/**
 * @author yanglin
 * @date 2020/4/8 18:42
 */
public class TargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] array = new int[nums.length];
        int j=0;
        for(int i=0;i<index.length;i++){
            if(index[i]<j){
                int[] array1 = Arrays.copyOfRange(array,index[i],j);
                array[index[i]] = nums[i];
                System.arraycopy(array1,0,array,index[i]+1,array1.length);
            }else{
                array[index[i]] = nums[i];
            }
            j++;
        }
        return array;
    }
}
