import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Hra hr = new Hra();
        Scanner sc = new Scanner(System.in);
        System.out.println("Má hádat počítač nebo ty? (0/1)");
        int input = sc.nextInt();
        if(input == 0) {
            hr.StartHrac();
        }
        else{
            hr.StartPC();
        }
    }
}
