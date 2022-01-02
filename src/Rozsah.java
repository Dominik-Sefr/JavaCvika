import java.util.Arrays;
import java.util.Scanner;

public class Rozsah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int pocet = sc.nextInt();
            if(pocet <= 0){
                break;
            }
            else{
                int[] pole = new int[pocet];
                for(int i = 0; i < pocet; i++){
                    pole[i] = sc.nextInt();
                }
                int min = Arrays.stream(pole)
                                .min()
                                .getAsInt();
                int max = Arrays.stream(pole)
                                .max()
                                .getAsInt();
                System.out.println(min + " " + max);
            }
        }
    }
}
