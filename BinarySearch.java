public class BinarySearch {

    // Recursive binary search function
    public static int binarySearch(int[] array, int target, int start, int end) {
        // If the start index is greater than the end index, the target is not present in the array.
        if (start > end) {
            return -1;
        }

        // Calculate the middle index of the current segment of the array
        int mid = start + (end - start) /  2;

        // Check if the target is at the mid index
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            // If the target is less than the mid element, search in the left half of the array
            return binarySearch(array, target, start, mid -  1);
        } else {
            // If the target is greater than the mid element, search in the right half of the array
            return binarySearch(array, target, mid +  1, end);
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {1,  2,  3,  4,  5,  6,  7,  8,  9,  10};
        // Target value to search for
        int target =  5;

        // Perform the binary search
        int result = binarySearch(array, target,  0, array.length -  1);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
