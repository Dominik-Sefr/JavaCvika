import java.util.Scanner;

public class Kruh{
    public static void main(String[] args) {
        double pi = 3.14;
        double s;
        double o;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        o = 2*r*pi;
        s = pi*r*r;
        System.out.printf("Obvod: "+ o + "\nobsah: " + s);
    }
}
