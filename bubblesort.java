public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 3, 4};
        bubble_sort(arr); 
        System.out.println(Arrays.toString(arr));
    }
  
    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}













// another method without function

public class Main {
  public static void main(String[] arg) {
    int arr[] = {8, 1, 3, 7, 5, 6, 2, 9};

    // Bubble Sort algorithm to sort the array in descending order
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i]>arr[j]) { // swap the values if the current value is less than the next value
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    // print the sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
