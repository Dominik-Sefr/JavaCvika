import java.util.Scanner;

public class Alkohol{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Zadej pohlaví: (m/w)");
        String poh = sc.next();
        System.out.printf("Zadej objem vypitého nápoje: ");
        double Q = sc.nextDouble();
        System.out.printf("Zadej procenta alkoholu v nápoji: ");
        double p = sc.nextDouble();
        System.out.printf("Zadej svou hmotnost: ");
        double mkonz = sc.nextDouble();
        double met;
        double rho = 0.8;
        double rm = 0.7;
        double rz = 0.6;
        double betam = 0.1;
        double betaz = 0.085;
        double prom;
        double uet;
        double hodiny;
        met = (Q * p * rho) / 100;
        if(poh.contains("m")){
            prom = met/(mkonz*rm);
            uet = mkonz*betam;
        }
        else{
            prom = met/(mkonz*rz);
            uet = mkonz*betaz;
        }
        hodiny = met/uet;
        System.out.printf("Alkohol odbouráš za: %.2f hodin", hodiny);
        System.out.printf("\nPromile: %.2f", prom);
        System.out.printf("\nMnožství alkoholu: %.2f", met);
    }
}
