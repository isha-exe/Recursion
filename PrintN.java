package recursion;

public class PrintN {
    public static void main(String[] args) {

        printNos(10);
    }
    static void printNos(int N)
    {
        //Your code here
        if(N==1){
            System.out.print(1 + " ");
            return;
        }
        printNos(N-1);
        System.out.print(N+" ");
    }
}
