import java.util.*;
public class Hodiny{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int H;
        int M;
        int S;

        System.out.print("Write Hours: ");
        H = sc.nextInt();
        System.out.print("Write Minutes: ");
        M = sc.nextInt();
        System.out.print("Write Seconds: ");
        S = sc.nextInt();
        S += H*3600 + M*60;
        System.out.println(S);
        int H2;
        int M2;
        int S1 = S%60;
        M = S/60;
        H = M/60;
        M = M-H*60;
        System.out.format(H + ":" + M + ":" + S1);

    }
}
