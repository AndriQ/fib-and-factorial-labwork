public class fibTail {
    
    public static int fibonacciTailRecursive(int number) {
        return fibonacciFactorialTail(number, 0, 1);
    }
    
    private static int fibonacciFactorialTail(int number, int a, int b) {
        if (number == 0) {
            return a;
        } else if (number == 1) {
            return b;
        } else {
            return fibonacciFactorialTail(number-1, b, a+b);
        }
    }

    public static void main (String[] args) {
        System.out.println(fibonacciTailRecursive(20));
    }
}
