public class Demo064 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {10, 20, 30, 40, 50};

        // Display the original array
        System.out.println("Original array:");
        printArray(array);

        // Swap the first and last elements
        swapFirstAndLast(array);

        // Display the modified array
        System.out.println("Array after swapping first and last elements:");
        printArray(array);
    }

    // Method to swap first and last elements of the array
    public static void swapFirstAndLast(int[] array) {
        if (array.length > 1) { // Ensure there are at least two elements to swap
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }

    // Method to print the elements of the array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}