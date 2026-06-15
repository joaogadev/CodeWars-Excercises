package YouAreASquare;

public class Square {
    public static boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (!(sqrt * sqrt == n)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 1;
        boolean result = isSquare(n);
        System.out.println(result);
    }

}
