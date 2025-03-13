import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        normaltriangle(4, 0);
//        triangle(4, 0);
        int[] arr = {4, 3, 2, 1};
//        bubbleSort(arr, arr.length-1, 0);
//        System.out.println(Arrays.toString(arr));

        SelectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    static void normaltriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            normaltriangle(r, c + 1);
            System.out.print("*");
        } else {
            normaltriangle(r - 1, 0);
            System.out.println();
        }
    }

    static void bubbleSort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSort(arr, r, c + 1);
        } else {
            bubbleSort(arr, r - 1, 0);
        }

    }

    static void SelectionSort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                SelectionSort(arr, r, c + 1, c);
            } else {
                SelectionSort(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            SelectionSort(arr, r - 1, 0, 0);

        }
    }
}