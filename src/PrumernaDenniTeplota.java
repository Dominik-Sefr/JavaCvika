import javax.swing.*;
import java.util.Scanner;
import java.util.Locale;

public class PrumernaDenniTeplota {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float prumernaTeplota;
        float eight = sc.nextFloat();
        float twelve = sc.nextFloat();
        float eighteen = sc.nextFloat();

        prumernaTeplota = (eight + twelve + 2*eighteen)/4;

        System.out.format(Locale.US, "%1.2f", prumernaTeplota);
    }
}

