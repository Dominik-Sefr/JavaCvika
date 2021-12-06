import java.util.Scanner;

public class PrevodSekund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sekundy = sc.nextInt();
        int h, m, s;
        h = sekundy/3600;
        sekundy -= h * 3600;
        m = sekundy/60;
        sekundy -= m*60;
        s = sekundy;
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}
