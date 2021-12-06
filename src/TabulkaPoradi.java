import java.util.Scanner;

public class TabulkaPoradi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int pos;
        pos = (row - 1) * cols + col;
        System.out.println(pos);
    }
}
