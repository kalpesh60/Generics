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
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0)
                max = array[i];
        }
        printMaximum(array, max);
        return max;
    }

    public static <T> void printMaximum(T[] array, T max) {
        for (int i = 1; i < array.length; i += array.length) {
            System.out.println("Maximum is:" +max);
        }
    }
}