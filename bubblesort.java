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
