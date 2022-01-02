import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StejnaData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocet = sc.nextInt();
        while(true){
            if(pocet > 0){
                List<Integer> list1 = new ArrayList<Integer>();
                List<Integer> list2 = new ArrayList<Integer>();
                int pocethodnot = sc.nextInt();
                for(int i = 0; i < pocethodnot; i++){
                    list1.add(sc.nextInt());
                }
                pocethodnot = sc.nextInt();
                for(int i = 0; i < pocethodnot; i++){
                    list2.add(sc.nextInt());
                }
                Collections.sort(list1);
                Collections.sort(list2);
                if(list1.equals(list2)){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
                pocet--;
            }
            else{
                break;
            }
        }
    }
}
