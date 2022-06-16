import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @author yanglin
 * @date 2020/4/8 18:42
 */
public class TargetArrayRun {

    private String str;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        int[] nums = {0,1,2,3,4};
//        int[] index = {0,1,2,2,1};
//        TargetArray targetArray = new TargetArray();
//        System.out.println(Arrays.toString(targetArray.createTargetArray(nums,index)));
        Integer[] array ={81,94,11,96,12,35,17,95,28,58,41,75,15};
        System.out.println(Arrays.toString(sort(array)));
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.getClass().getMethod("add",Object.class).invoke(list,"ab");
//        System.out.println(list.toString());
    }

    public static Integer[] sort(Integer[] array){
        int j;
        for (int gap = array.length/2;gap>0;gap/=2){
            for (int i= gap;i< array.length;i++){
                Integer integer = array[i];
                for (j = i;j>=gap&& integer.compareTo(array[j-gap])<0;j-=gap){
                    array[j] = array[j-gap];
                }
                array[j] = integer;
            }
        }
        return array;
    }

    public static Integer[] quickSort(Integer[] array,Integer low,Integer high){
        if (low>high){
            return array;
        }
        int i = low;
        int j = high;
        Integer temp;
        temp = array[low];
        while (i<j){
            while (i<j && array[j]>temp){
                j--;
            }
            array[i] = array[j];
            while (i<j && array[i]<temp){
                i++;
            }
            array[j] = array[i];
        }
        array[i] = temp;
        quickSort(array,low,i-1);
        quickSort(array,i+1,high);
        return array;
    }

}
