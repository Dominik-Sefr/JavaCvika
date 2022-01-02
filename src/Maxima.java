import java.util.*;

public class Maxima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pocet");
        while(true){
            int pocet = sc.nextInt();
            if(pocet > 0){
                List<Integer> list = new ArrayList<Integer>();
                int max1 = 0;
                int count1 = 0;
                int max2 = 0;
                int count2 = 0;
                int max3 = 0;
                int count3 = 0;
                int max4 = 0;
                int count4 = 0;
                while(true){
                    System.out.println("cislo");
                    int cislo = sc.nextInt();
                    if(cislo <= 0){
                        break;
                    }
                    else{
                        list.add(cislo);
                    }
                }
                Collections.sort(list);
                max1 = list.get(list.size()-1);
                count1 = Collections.frequency(list, max1);
                removeAll(list, max1);
                max2 = list.get(list.size()-1);
                count2 = Collections.frequency(list, max2);
                removeAll(list, max2);
                max3 = list.get(list.size()-1);
                count3 = Collections.frequency(list, max3);
                removeAll(list, max3);
                max4 = list.get(list.size()-1);
                count4 = Collections.frequency(list, max4);
                System.out.println(max1 + " " + count1);
                System.out.println(max2 + " " + count2);
                System.out.println(max3 + " " + count3);
                System.out.println(max4 + " " + count4);
                pocet--;
            }
            else{
                break;
            }
        }
    }
    static void removeAll(List<Integer> list, Integer element) {
        int index;
        while ((index = list.indexOf(element)) >= 0) {
            list.remove(index);
        }
    }
}