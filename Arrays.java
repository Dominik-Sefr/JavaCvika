class ArrayTools {
    public static void main(String[] args) {
        String[] pole = {"Ahoj", "ne", "neco", "ne"};
        Double[] pole1 = {1.0,2.0,3.0,4.0,5.0};
        String a = "ne";
        GetCount(pole, a);
        GetEvenAndOdd(pole1);
    }

    static <T> void GetCount(T[] pole,  T value){
        int count = 0;
        for(T i : pole){
            if(i == value){
                count++;
            }
        }
        System.out.printf("'%s' is %s times in Array\n", value, count);
    }

    static <T extends Number> void GetEvenAndOdd(T[] pole){
        int countEven = 0;
        int countOdd = 0;
        for(T i : pole){
            if(i.intValue() % 2 == 1){
                countOdd++;
            }
            else{
                countEven++;
            }
        }
        System.out.printf("Even: %s\nOdd: %s", countEven, countOdd);
    }
}
