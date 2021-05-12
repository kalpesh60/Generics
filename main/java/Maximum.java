public class Maximum <T extends Comparable<T>> {
    T first, second, third;

    public Maximum(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

//For multiple Parameters
    public static <T extends Comparable<T>> T multipleValues(T[] array) {
        T max = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i].compareTo(max) > 0)
                max = array[i];
        }
        return max;
    }

//For Three Parameters
    public static <T extends Comparable<T>> T printMaximum(T first, T second, T third) {
        T max = first;
        if (second.compareTo(max) > 0)
            max = second;
        if (third.compareTo(max) > 0)
            max = third;
        return max;
    }

}
//    public static int maxInteger(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
//        int max = firstNumber;
//        if(secondNumber.compareTo(max) > 0)
//            max = secondNumber;
//        if(thirdNumber.compareTo(max) > 0)
//            max = thirdNumber;
//        return max;
//    }
//
//    public static float maxFloat(Float firstNumber, Float secondNumber, Float thirdNumber) {
//        float max1 = firstNumber;
//        if(secondNumber.compareTo(max1) > 0)
//            max1 = secondNumber;
//        if(thirdNumber.compareTo(max1) > 0)
//            max1 = thirdNumber;
//        return max1;
//    }
//
//    public static String maxString(String firstString, String secondString, String thirdString) {
//        String max2 = firstString;
//        if(secondString.compareTo(max2) > 0)
//            max2 = secondString;
//        if(thirdString.compareTo(max2) > 0)
//            max2 = thirdString;
//        return max2;
//    }
//}
