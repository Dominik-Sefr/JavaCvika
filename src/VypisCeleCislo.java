import java.util.Scanner;

public class VypisCeleCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean sign = input < 0;
        input = Math.abs(input);
        System.out.printf(((sign) ? "-" : "+") + "%03d", input);
    }
}
