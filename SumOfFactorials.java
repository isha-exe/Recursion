import java.util.ArrayList;

    static long sum(long N){
        int sum = 0;
        for(int i = 1 ; i<=N; i++){
                sum += fact(i);
        }
        return sum;
    }
    static long fact(long N){
        if(N==1){
            return 1;
        }
        return N*fact(N-1);
    }
