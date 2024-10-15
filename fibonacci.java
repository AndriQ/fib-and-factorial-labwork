public class fib {

    public static int fibonacciPseudo(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fibonacciPseudo(number-1) + fibonacciPseudo(number-2);
        }

    }
    
    public static void main(String[] args) {
        System.out.println(fibonacciPseudo(20));
    }
}
