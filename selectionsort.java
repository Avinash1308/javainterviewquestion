public class Main{
  public static void main(String[] arg){
    int[] arr={12,65,74,23,65,35};
    selection_sort(arr);
    for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    
    
  }
  public static void selection_sort(int [] arr){
    int n=arr.length;
    for (int i=0;i<arr.length;i++){
      int minIndex=i;
      for(int j=i+1;j<n;j++){
        if(arr[j]<arr[minIndex]){
          minIndex=j; 
        }
      
      }
      int temp=arr[minIndex];
      arr[minIndex]=arr[i];
      arr[i]=temp;
    }
  }
    
  }

