import java.util.Scanner;

public class Sedmnact {
    public static void main(String[] args) {
        int[] A = new int[2];
        int[] B = new int[2];
        int[] C = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.printf("Zadej Ax: ");
        A[0] = sc.nextInt();
        System.out.printf("Zadej Ay: ");
        A[1] = sc.nextInt();
        System.out.printf("Zadej Bx: ");
        B[0] = sc.nextInt();
        System.out.printf("Zadej By: ");
        B[1] = sc.nextInt();
        System.out.printf("Zadej Cx: ");
        C[0] = sc.nextInt();
        System.out.printf("Zadej Cy: ");
        C[1] = sc.nextInt();
        double O = delka(A,B) + delka(B,A) + delka(B,C);
        double S = O/2;
        System.out.printf("Obvod: %s Obsah: %s", O, S);

    }

    private static double delka(int[] x, int[] y) {
        double lnght = Math.sqrt(Math.pow((x[0] - y[0]), 2) + Math.pow((x[1]-y[1]), 2));
        return lnght;
    }
}
