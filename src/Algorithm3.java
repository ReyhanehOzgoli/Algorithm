public class Algorithm3 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 7, 8, 4};
        algorithm3(array, 11);

    }

    public static void algorithm3(int[] myArray, int number) {
        for (int i = 0; i < myArray.length; ++i) {
            for (int j = i+1; j < myArray.length; ++j) {
                if (myArray[i] + myArray[j] == number) {
                    System.out.println(myArray[i]+ "," + myArray[j]);

                }
            }
        }
    }
}