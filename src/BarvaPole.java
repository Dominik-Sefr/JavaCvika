import java.util.Scanner;

public class BarvaPole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputX;
        int inputY;
        while(true){
            inputX = sc.nextInt();
            if(inputX >= 0){
                inputY = sc.nextInt();
                if(inputX % 2 == 0 && inputY % 2 == 0){
                    System.out.print("BILA ");
                }
                else if(inputX % 2 == 0 && inputY % 2 == 1){
                    System.out.print("CERNA ");
                }
                else if(inputX % 2 == 1 && inputY % 2 == 1){
                    System.out.print("BILA ");
                }
                else if(inputX % 2 == 1 && inputY % 2 == 0){
                    System.out.print("CERNA ");
                }
            }
            else{
                break;
            }

        }
    }
}
