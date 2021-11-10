import java.util.*;
public class Posloupnosti1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int vstup;
        int sum;
        double avg;
        while(true){
            vstup = sc.nextInt();
            if(vstup > 0){
                list.add(vstup);
            }
            else{
                break;
            }
        }
        sum = list.stream()
                .mapToInt(i -> i)
                .sum();
        avg = list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
        System.out.println(sum + " " + avg);

    }
}
