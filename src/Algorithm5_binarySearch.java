public class Algorithm5_binarySearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 11, 15};
        System.out.println(binarySearch(array, 15));

    }

    public static int binarySearch (int[] myArray, int target) {
        int start = 0;
        int end = myArray.length-1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (myArray[mid] == target)
                return mid;

            if (myArray[mid] < target)
                start = mid + 1;

            if (myArray[mid] > target)
                end = mid - 1;

            mid = (start + end) / 2;
        }
        if (start > end){
            return -1;
        }
        return mid;
    }
}
