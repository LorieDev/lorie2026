public class FibonacciCalculator {

    public static int fibonacci(int n){

        // condition
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        // method call itself
        return fibonacci(n -1 ) + fibonacci(n- 2);


    }
}
