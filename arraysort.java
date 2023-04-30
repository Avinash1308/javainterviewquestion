import java.util.Arrays;
public class Main{
  public static void main(String[] arg){
    int[] arr={2,9,3,8,4,1,7,6,5};
    int[] arr1=new int[arr.length];
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
      arr1[i]=arr[i];
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr1[i]);
    }
  }
}
