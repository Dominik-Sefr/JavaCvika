import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Hra {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    public void StartHrac(){
        int cislo;
        int odpoved;
        System.out.println("Mysli si číslo a řekni rozsah");
        System.out.print("Min:");
        int min = sc.nextInt();
        System.out.print("Max:");
        int max = sc.nextInt() + 1;
        while(true){
            cislo = rand.nextInt(max-min) + min;
            System.out.printf("Počítač hádá %s", cislo);
            System.out.println(" (Míň = 1, Víc = 2, Správně = 0)");
            odpoved = sc.nextInt();
            if(odpoved == 0){
                System.out.println("Počítač vyhrál");
                break;
            }
            else if(odpoved == 1 ){
                max = cislo;
            }
            else if(odpoved == 2){
                min = cislo;
            }
        }
    }
    public void StartPC() {
        int input;
        System.out.print("Zadej min: ");
        int min = sc.nextInt();
        System.out.println("Zadej max");
        int max = sc.nextInt() + 1;
        int cislo = rand.nextInt(max - min) + min;
        while (true) {
            System.out.print("Zadej číslo: ");
            input = sc.nextInt();
            if(input < min || input > max){
                System.out.println("Jsi mimo rozsah");
            }
            else if(input == cislo){
                System.out.println("Správně");
                break;
            }
            else if(input > cislo){
                System.out.println("Míň");
            }
            else if(input < cislo){
                System.out.println("Víc");
            }
        }
    }

}
