import java.util.Scanner;

public class CtyriCisla {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(true) {
            if(count > 0) {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int num3 = sc.nextInt();
                int num4 = sc.nextInt();
                int low1, high1, low2, high2, lowest, middle1, middle2, highest;
                if (num1 < num2) {
                    low1 = num1;
                    high1 = num2;
                } else {
                    low1 = num2;
                    high1 = num1;
                }
                if (num3 < num4) {
                    low2 = num3;
                    high2 = num4;
                } else {
                    low2 = num4;
                    high2 = num3;
                }
                if (low1 < low2) {
                    lowest = low1;
                    middle1 = low2;
                } else {
                    lowest = low2;
                    middle1 = low1;
                }
                if (high1 > high2) {
                    highest = high1;
                    middle2 = high2;
                } else {
                    highest = high2;
                    middle2 = high1;
                }
                if (middle1 < middle2) {
                    System.out.printf("\n%s %s %s %s\n", lowest, middle1, middle2, highest);
                } else {
                    System.out.printf("\n%s %s %s %s\n", lowest, middle2, middle1, highest);
                }
                count--;
            }
            else{
                break;
            }
        }
    }
}