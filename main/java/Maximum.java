public class Maximum {
    public static int maxInteger(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
        int max = firstNumber;
        if(secondNumber.compareTo(max) > 0)
            max = secondNumber;
        if(thirdNumber.compareTo(max) > 0)
            max = thirdNumber;
        return max;
    }
}
