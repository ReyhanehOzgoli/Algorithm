public class Algorithm4 {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 11, 15};
        System.out.println(algorithm4(array, 11));
    }

    public static int algorithm4 (int[] myArray, int number){
        for (int i= 0; i< myArray.length; ++i){
            if (myArray[i] == number){
                return i;
            }
        }return -1;

    }
}
