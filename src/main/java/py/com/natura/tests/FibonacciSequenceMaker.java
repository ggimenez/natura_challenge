package py.com.natura.tests;

public class FibonacciSequenceMaker {
    public static long makeFibonacci(long n) {
        if(n==0 ){

            return 0;
        }else if(n==1){
            return 1;
        } else {
            return makeFibonacci(n - 1) + makeFibonacci(n - 2);
        }
    }

}
