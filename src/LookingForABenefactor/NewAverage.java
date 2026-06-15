package LookingForABenefactor;

public class NewAverage {
    public static long newAvg(double[] arr, double navg) {
        double tot = 0;
        for (int i = 0; i < arr.length; i++) {
            tot += arr[i];
        }

        double next = navg * (arr.length + 1) - tot;

        if (next <= 0) {
            throw new IllegalArgumentException("Expected new value too low");
        }

        return (long) Math.ceil(next);
    }

    public static void main(String[] args) {
        double[] arr = {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0};
        double navg = 2.0;
        double result = newAvg(arr, navg);
        System.out.println(result);
    }
}
