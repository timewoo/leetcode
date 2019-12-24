import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yanglin
 * @date 2019/12/24
 */
public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] s = cpdomains[i].split(" ");
            Integer value = Integer.valueOf(s[0]);
            String[] k = s[1].split("\\.");
            String m = "";
            for (int j = k.length - 1; j >= 0; j--) {
                if (j != k.length - 1) {
                    m = new StringBuilder(k[j]).append(".").append(m).toString();
                } else {
                    m = k[j];
                }
                if (map.containsKey(m)) {
                    map.put(m, map.get(m) + value);
                } else {
                    map.put(m, value);
                }
            }
        }
        return map.entrySet().stream().map(value -> value.getValue() + " " + value.getKey()).collect(Collectors.toList());
    }
}
