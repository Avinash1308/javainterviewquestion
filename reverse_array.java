import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse_array(arr);
        System.out.println(Arrays.toString(arr)); // prints [5, 4, 3, 2, 1]
    }
    
    public static void reverse_array(int[] arr) {
        int start = 0;
        int end = arr.length - 1; // fix the off-by-one error
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}





//another way
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        for(int i=arr.length-1;i>=0;i--){
          System.out.print(arr[i]+" ");
        }
    }
    
    
    
}




import java.util.Arrays;
class Main{
  public static void main(String[] args){
    int arr[]={1,2,3,4,5,6};
    int len=arr.length;
    int reverse_arr[]=new int [len];
    int start=0;
    while(start<len){
      for(int i=len-1;i>=0;i--){
        reverse_arr[start]=arr[i];
        start++;
      }
    }
    System.out.println(Arrays.toString(reverse_arr));
  }
}
