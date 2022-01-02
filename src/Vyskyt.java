import java.util.Scanner;

public class Vyskyt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocet = sc.nextInt();
        while(true){
            if(pocet > 0){
                int prvni = sc.nextInt();
                int druhy = sc.nextInt();
                int coun = sc.nextInt();
                boolean neco = false;
                int[] pole = new int[coun];
                for(int i = 0; i < coun; i++){
                    pole[i] = sc.nextInt();
                }
                for(int i = 0; i < coun-1; i++){
                    if(pole[i] == prvni && pole[i+1] == druhy){
                        neco = true;
                    }
                }
                System.out.println(neco);
                pocet--;
            }
            else{
                break;
            }
        }
    }
}
