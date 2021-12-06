import java.util.Arrays;
import java.util.Scanner;

public class Posloupnosti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pole = new int[n];
        int sum;
        double avg;
        for(int i = 0; i<pole.length; i++){
            pole[i] = sc.nextInt();
        }
        sum = Arrays.stream(pole).sum();
        avg =(double) sum/pole.length;

        String vypis = Arrays.toString(pole);
        System.out.println(vypis);
        System.out.println(sum);
        System.out.println(avg);
    }
}
