import java.util.Scanner;

public class Cena{
    public static void main(String[] args){
        int price;
        //vstup
        Scanner sc= new Scanner(System.in);
        System.out.print("price: ");
        int money = sc.nextInt();
        price = money;
        int hundred;
        int fifty;
        int twenty;
        int ten;
        int five;
        int two;
        //výpočet
        hundred = price/100;
        price -= hundred*100;
        fifty = price/50;
        price -= fifty*50;
        twenty = price/20;
        price -= twenty*20;
        ten = price/10;
        price -= ten*10;
        five = price/5;
        price -= five*5;
        two = price/2;
        price -= two*2;
        //výstup
        System.out.println("\nHundreds: " + hundred + "\nFifties: " + fifty + "\nTwenties: " + twenty + "\ntens: " + ten + "\nfives: " + five + "\ntwos: " + two + "\nOnes: " +price);
    }
}
