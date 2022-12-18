public class Algorithm1 {
    public static void main(String[] args) {
        int[] array1 = {5, 4, 3, 15, 20};
        int[] array2 = {5, 3, 15};
        System.out.println(algorithm1(array1, array2));
    }

    public static boolean algorithm1(int[] myArray, int[] otherArray) {
        int myArrayIndex = 0;
        int otherArrayIndex = 0;
        while (myArrayIndex < myArray.length && otherArrayIndex < otherArray.length){
            if (myArray[myArrayIndex] == otherArray[otherArrayIndex]){
                otherArrayIndex++;
            }myArrayIndex++;
            if (otherArrayIndex == otherArray.length){
                return true;
            }
        }return false;
    }
}