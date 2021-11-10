import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Kolik proměnných chceš seřadit?: ");
            int leng = sc.nextInt();
            int[] numbers = new int[leng];
            for(int i = 0; i < numbers.length; i++){
                System.out.printf("Zadej hodnotu čísla %s : ", i);
                numbers[i] = sc.nextInt();
            }
            System.out.println("Jak chcete seřadit čísla? (vzestupně - 1/sestupně - 0)");
            int sor = sc.nextInt();
        /*System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;*/
            Arrays.sort(numbers);

            if (sor == 1) {
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);
                }
            }
            else {
                for (int i = numbers.length - 1; i >= 0; i--) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}