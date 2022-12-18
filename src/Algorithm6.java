import java.util.Arrays;

public class Algorithm6 {
    public static void main(String[] args) {
        int[] array = new int[]{-5, -2, 1, 3, 4};
        System.out.println(Arrays.toString(algorithm6(array)));

    }

    public static int[] algorithm6(int[] myArray){
        int[] squaredArray = new int[myArray.length];

        int start = 0;
        int end = myArray.length -1;
        int endSquaredArray = squaredArray.length-1;
        while (start<=end) {
            if (myArray[start] * myArray[start] > myArray[end] * myArray[end]) {
                squaredArray[endSquaredArray] = myArray[start] * myArray[start];
                start++;
            }else {
                squaredArray[endSquaredArray] = myArray[end] * myArray[end];
                end--;
            }
            endSquaredArray--;
        }return squaredArray;
    }
}
