import java.util.Scanner;

public class Cifry {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.next();
            int soucet = 0;
            long soucin = 1;
            if(Long.parseLong(input) > 0){
                for(int i = 0; i < input.length(); i++){
                    long cifra = Long.parseLong(String.valueOf(input.charAt(i)));
                    soucet += cifra;
                    soucin *= cifra;
                }
                System.out.println(soucet + " "+ soucin);
            }
            else{
                break;
            }
        }

    }
}