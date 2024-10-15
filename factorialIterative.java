public class factIter {
    
    public static int factIterating(int number) {
        int sum = 1;
        while (number != 0) {
            sum = sum*number;
            number -= 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(factIterating(5));
    }

    // Complexity is O(n)
}
