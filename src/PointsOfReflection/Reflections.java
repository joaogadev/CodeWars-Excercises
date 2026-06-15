package PointsOfReflection;

public class Reflections {
    public static int[] reflectPoint(int[] p, int[] q) {

        return new int[] {
            2 * q[0] - p[0],
            2 * q[1] - p[1]
        };
    }

    public static void main(String[] args) {
        int[] p = {1, 2};
        int[] q = {3, 4};
        int[] reflectedPoint = reflectPoint(p, q);
        System.out.println("Reflected Point: [" + reflectedPoint[0] + ", " + reflectedPoint[1] + "]");
    }
}
