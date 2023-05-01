public class Main{
  public static void main(String[] arg){
    int[] arr={92,24,35,14,95};
    int smallest=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<smallest){
        smallest=arr[i];
      }
    } 
    System.out.print(smallest);
  }
}
