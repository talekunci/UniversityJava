package ua.cpu.lw3;

/**
* This class calculates the angle of two vectors
*/
public class ThirdTask {

    private static final int[] A = {5, 8};
    private static final int[] B = {-4, -5};

    public static void main(String[] args) {
        System.out.printf("Vector A{%d, %d};%nVector B{%d, %d};%n",
                A[0], A[1],
                B[0], B[1]
        );

        System.out.print("Name: 'A0' --> ");
        System.out.println("Angle: " + new ThirdTask().calcVectorsAngle(A, B) + "°");
    }

    double calcVectorsAngle(int[] a, int[] b) {
        int denominator = a[0] * b[0] + a[1] * b[1];

        double aModulo = Math.sqrt(Math.pow(a[0], 2) + Math.pow(a[1], 2));
        double bModulo = Math.sqrt(Math.pow(b[0], 2) + Math.pow(b[1], 2));

        double numerator = aModulo * bModulo;

        double cos = denominator / numerator;

        return Math.toDegrees(Math.acos(cos));
    }

}
