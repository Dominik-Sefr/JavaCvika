import java.util.Scanner;

public class TabulkaPozice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int pos = sc.nextInt();
        int finalrow;
        int finalcol;
        finalrow = (int) Math.ceil((double) pos/ (double) cols);
        finalcol = pos - (finalrow-1)*cols;
        System.out.printf("%s %s", finalrow, finalcol);

    }
}
