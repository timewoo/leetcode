package run;

/**
 * @author yanglin
 * @date 2020/1/16
 */
public class RemoveDuplicates {

    public String removeDuplicates(String S) {
        boolean falg = false;
        while(!S.isEmpty() && !falg){
            falg = true;
            for(int i=1;i<S.length();i++){
                if(S.charAt(i-1)==S.charAt(i)){
                    S = S.replace((S.charAt(i-1)+""+S.charAt(i)+""),"");
                    falg = false;
                    break;
                }
            }
        }
        return S;
    }
}
