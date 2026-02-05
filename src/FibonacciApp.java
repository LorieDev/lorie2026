public class FibonacciApp {
    public static void main(String [] args){

        // variable
        int n = 10;

        // call the method
        int result = FibonacciCalculator.fibonacci(n);

       // print the message
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
