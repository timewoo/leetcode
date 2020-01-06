package run;

import java.util.*;

/**
 * @author yanglin
 * @date 2020/1/2
 */
public class MinimumAbsDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        Map<Integer,List<List<Integer>>> minMap = new HashMap<>();
        for(int i=1;i<arr.length;i++){
            int min = arr[i]-arr[i-1];
            List<List<Integer>> minList = new ArrayList<>();
            if(minMap.keySet().contains(min)){
                minList = minMap.get(min);
                minList.add(Arrays.asList(arr[i-1],arr[i]));
            }else{
                minList.add(Arrays.asList(arr[i-1],arr[i]));
                minMap.put(min,minList);
            }
        }
        Set<Integer> set = minMap.keySet();
        Object[] obj = set.toArray();
        Arrays.sort(obj);
        return minMap.get(obj[0]);
    }
}
