public class Maximum {
    public static int maxInteger(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
        int max = firstNumber;
        if(secondNumber.compareTo(max) > 0)
            max = secondNumber;
        if(thirdNumber.compareTo(max) > 0)
            max = thirdNumber;
        return max;
    }

    public static float maxFloat(Float firstNumber, Float secondNumber, Float thirdNumber) {
        float max1 = firstNumber;
        if(secondNumber.compareTo(max1) > 0)
            max1 = secondNumber;
        if(thirdNumber.compareTo(max1) > 0)
            max1 = thirdNumber;
        return max1;
    }
}
