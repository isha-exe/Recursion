import java.util.ArrayList;

static ArrayList<Long> factorialNumbers(long N){
        
        ArrayList<Long> list = new ArrayList<Long>();
        for(int i = 1; i <= N ; i++){
            if(fact(i)<=N){
                list.add(fact(i));
            }
            else if(fact(i)>N){
                break;
            }
        }
        return list;


    }
    static long fact(long N){
        if(N==1){
            return 1;
        }
        return N*fact(N-1);
    }
