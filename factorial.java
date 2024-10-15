public class FACT {

    public int factMethod(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factMethod(number-1);
        }
    }

    // Complexity is O(n)
}