import java.util.Scanner;

public class RodneCislo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String rok;
        String mesic;
        String den;
        int mesicint;
        rok = input.substring(0,2);
        mesic = input.substring(2,4);
        den = input.substring(4,6);
        mesicint = Integer.parseInt(mesic);
        if(mesicint>12){
            mesicint = mesicint - 50;
            mesic = Integer.toString(mesicint);
        }
        System.out.printf("\nRok: %s\nMesic: %s\nDen: %s", rok, mesic, den);
    }
}
