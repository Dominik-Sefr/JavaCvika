import java.util.Scanner;
import java.util.Locale;
public class VypisRealneCislo{

    static Locale loc = new Locale ("CS", "cz");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) {
        sc.useLocale(loc);
        double cislo = sc.nextDouble();
        System.out.format(loc, "%10.3f", cislo);
    }
}