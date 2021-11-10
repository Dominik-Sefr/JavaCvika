import java.util.Collections;

public class Obrazce {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        String obdelnik = "";
        String vlajka = "";
        String vlajkaob = "";
        String troj = "";
        String troju = "";
        //obdélník
        for(int i = 1; i <=n;i++){
           obdelnik += "\n" + String.join("", Collections.nCopies(m, "* "));
        }

        //trojuhelník pravouhly

        for(int i = 1; i<=n;i++){
            troj += "\n" + String.join("", Collections.nCopies(i, "* "));
        }
        //trojuhelnik rovnorameny
        for(int i = 1; i<=n; i++){
            troju += "\n" + String.join("", Collections.nCopies((n-i), " ")) + String.join("", Collections.nCopies(i, "* "));
            //System.out.println(" ".repeat(n-i) + "* ".repeat(i));
        }
        //vlajka++ čr
        /*

         * o o o o
         * * 9 9 9
         * / / / /

         * o o o o o
         * * o o o o
         * * / / / /
         * / / / / /

         * o o o o o o o
         * * o o o o o o
         * * * 9 9 9 9 9
         * * / / / / / /
         * / / / / / / /

         * * * * * * * *
         *   *         *
         *     * * * * *
         *   *         *
         * * * * * * * *

         * * * * * * * * * * *
         *   *               *
         *     *             *
         *       * * * * * * *
         *     *             *
         *   *               *
         * * * * * * * * * * *
        */
        final String ANSI_BLUE = "\u001B[34m" + "\u001B[44m";
        final String ANSI_WHITE = "\u001B[37m" + "\033[0;107m";
        final String ANSI_RED = "\u001B[31m" + "\u001B[41m";
        final String ANSI_RESET = "\u001B[0m";
        int r = 4;
        int c = (int) Math.ceil(r * 1.5);
        System.out.println(c);
        for(int i = 1; i <= r; i++){
            if((i <= (double) r/2)) {
                vlajka += "\n" + ANSI_BLUE +  String.join("", Collections.nCopies((i), "* ")) + ANSI_WHITE + String.join("", Collections.nCopies((c - i - 1), "o ")) + "o" + ANSI_RESET;
                //System.out.println("* ".repeat(i) + "o ".repeat(c - i));
            }
            else if( i != (double) r/2 && i == (int) Math.ceil((double) r/2)){
                vlajka += "\n" + ANSI_BLUE +String.join("", Collections.nCopies((i), "* ")) + ANSI_WHITE +  String.join("", Collections.nCopies((c - i - 1), "9 ")) + "9" + ANSI_RESET;
                //System.out.println("* ".repeat(i) + "9 ".repeat(c - i));
            }
            else{
                vlajka += "\n" + ANSI_BLUE + String.join("", Collections.nCopies((r+1 - i), "* ")) + ANSI_RED + String.join("", Collections.nCopies((c - (r+2- i)), "/ ")) + "/" + ANSI_RESET;
                //System.out.println("* ".repeat(r+1 - i) + "/ ".repeat(c - (r+1-i)));
            }
        }


        //vlajka obrys
        for(int i = 1; i <= r; i ++){
            if(i == 1 || i == r){
                vlajkaob += "\n" + String.join("", Collections.nCopies(c, "* "));
            }
            else if((double) i ==(double) r/2 || (double) i-1 == (double) r/2){
                if(i-1 == r/2){
                vlajkaob += "\n* " + String.join("", Collections.nCopies(i-2, "  ")) + String.join("", Collections.nCopies(r, "* "));}
                else{
                vlajkaob += "\n* " + String.join("", Collections.nCopies(i-1, "  ")) + String.join("", Collections.nCopies(r, "* "));}
            }
            else if(i != (double) r/2 && i == (int) Math.ceil((double) r/2)){
                vlajkaob += "\n* " + String.join("", Collections.nCopies(i-1, "  ")) + String.join("", Collections.nCopies(r, "* "));
            }
            else if(i <= r/2){
                vlajkaob += "\n* " + String.join("", Collections.nCopies(i-1, "  ")) + "* " + String.join("", Collections.nCopies(c - (i+2), "  ")) + "* ";
            }
            else{
                vlajkaob += "\n* " + String.join("", Collections.nCopies(2*(r-i), " ")) + "* " + String.join("", Collections.nCopies((c - (r+3- i)), "  ")) + "* ";
            }
        }

        System.out.println(obdelnik);
        System.out.println(troj);
        System.out.println(troju);
        System.out.println(vlajka);
        System.out.println(vlajkaob);
    }
}
