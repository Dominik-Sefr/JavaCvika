import java.math.BigInteger;
import java.util.Scanner;

public class Nasobeni {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(true){
            if(count > 0){
                BigInteger n1 = sc.nextBigInteger();
                BigInteger n2 = sc.nextBigInteger();
                System.out.println(n1.multiply(n2));
                count--;
            }
            else{
                break;
            }
        }

    }
}