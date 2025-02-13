//Finding the target in Infinite Array
public class getcode {
    public static void main(String[] args) {
        // Infinite Array Simulation
        int[] arr = {3, 4, 6, 7, 8, 9, 21, 23, 45, 65, 87, 89, 98, 123, 324, 435, 566, 767};
        int target = 98;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Fixed: Return index instead of -1
            }
        }
        return -1;
    }
}
