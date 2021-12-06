import java.util.Scanner;

public class Sekundy{
    public static void main(String[] args) {
        int inputS;
        int inputM;
        int inputH;
        Scanner sc= new Scanner(System.in);
        System.out.print("Zadej sekundy: ");
        inputS = sc.nextInt();
        System.out.print("Zadej minuty: ");
        inputM = sc.nextInt();
        System.out.print("Zadej hodiny: ");
        inputH = sc.nextInt();
        double hodiny =  (double)inputS/3600 + (double)inputM/60 + inputH;
        System.out.println(hodiny);
        int outputS;
        int outputM;
        int outputH;
        outputH = (int) hodiny;
        outputM = (int)(hodiny*60 - outputH*60);
        outputS = (int)(hodiny*3600 - outputH*3600 - outputM*60);
        System.out.printf("Sekundy: %s Minuty: %s Hodiny: %s", outputS, outputM, outputH);

    }
}
