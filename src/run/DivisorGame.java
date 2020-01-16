package run;

/**
 * @author yanglin
 * @date 2020/1/16
 */
public class DivisorGame {

    public boolean divisorGame(int N) {
        int index=0;
        while(N>1){
            index++;
            for(int i=1;i<N;i++){
                if(N%i==0){
                    N = N-i;
                    break;
                }
            }
        }
        if(index%2==0){
            return false;
        }else{
            return true;
        }
    }
}
