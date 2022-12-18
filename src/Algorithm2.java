import java.util.Arrays;

public class Algorithm2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        algorithm2(array);
    }

    public static void algorithm2 (int[] myArray){
        int[] sumArray = new int[myArray.length];

        for (int i = 1; i< myArray.length; ++i){
            sumArray[0] = myArray[0];
            sumArray[i] = myArray[i-1] + myArray[i];
        }
        System.out.println(Arrays.toString(sumArray));
    }
}
