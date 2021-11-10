public class Petka {
    public static void main(String[] args){
        //A
        int a = 1;
        int b = 0;
        System.out.println(a+"\n"+b);
        int c = b;
        b = a;
        a = c;
        System.out.println(a+"\n"+b);
        //B
        int ab = 0;
        int bb = ab++;
        ab+=1;
        ab = ab+1;
        ab = ab+bb;
        ab += bb;
        ab++;
        //C
        int[][] tabulka = new int[10][10];
        for(int i = 0; i<10;i++){
            for(int j = 0; j<10; j++){
                tabulka[i][j] = i + j;
            }
        }
        System.out.println(tabulka);
    }
}
