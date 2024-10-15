public class factTail {
    
    public static void main(String[] args) {
        int result = factMethod(5);
        System.out.println(result);
    }

    public static int factMethod(int number) {
        return tailFactorial(number, 1);
    }

    private static int tailFactorial(int number, int accumulator) {
        if (number == 1) {
            return accumulator;
        } else {
            return tailFactorial(number - 1, number * accumulator);
        }
    }

    // Complexity is O(n)
}
