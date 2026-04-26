package ProgrammingLogic;

public class VectorMultiplication {
    public static void main(String[] args) {

        int[] v1 = new int[9];
        int[] v2 = new int[9];
        int[] vr = new int[9];

        v1[0] = 1;
        v1[1] = 2;
        v1[2] = 3;
        v1[3] = 4;
        v1[4] = 5;
        v1[5] = 6;
        v1[6] = 7;
        v1[7] = 8;
        v1[8] = 9;

        v2[0] = 2;
        v2[1] = 3;
        v2[2] = 4;
        v2[3] = 5;
        v2[4] = 6;
        v2[5] = 7;
        v2[6] = 8;
        v2[7] = 9;
        v2[8] = 0;

        for (int i = 0; i < v1.length; i++) {
            vr[i] = v1[i] * v2[i];
            System.out.println(vr[i]);
        }
    }
}
