package FindTheOddInt;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {
        return Arrays.stream(a)
                .filter(i -> Arrays.stream(a).filter(x -> x == i).count() % 2 != 0)
                .findFirst()
                .orElse(0);
    }

    public static void main(String[] args) {
        int[] a = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 4, 8, 8};
        int result = findIt(a);
        System.out.println(result);
    }
}
