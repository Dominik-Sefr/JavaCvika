import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RozkladCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        while(true){
            input = sc.nextInt();
            if(input != -1){
            List<Integer> primenumbers = new ArrayList<Integer>();
                for (int i = 2; i <= input; i++) {
                    while (input % i == 0) {
                        primenumbers.add(i);
                        input /= i;
                    }
                }
                for(Integer i : primenumbers){
                    System.out.printf("%s ", i);
                }
            }
            else{
                break;
            }
        }
    }
}
