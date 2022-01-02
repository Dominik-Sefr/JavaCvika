import java.util.Scanner;

public class DelitelNasobek {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int input1 = sc.nextInt();
            if(input1 > 0){
                int input2 = sc.nextInt();
                System.out.printf("\n%s %s", gcd(input1, input2), lcm(input1, input2));
            }
            else{
                break;
            }
        }
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static long lcm(int a, int b)
    {
        return (long) (a / gcd(a, b)) * b;
    }
}