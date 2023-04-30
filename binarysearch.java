class Main {
  public static void main(String[] args) {
    Binary_search b= new Binary_search();
    int[] arr={1,2,3,4,8,9,10,11,12,16,17,85,90};
    int x=12;
    int result=b.binary_search(arr, x);
    if(result==-1){
      System.out.println("element not found");
    }
    else{
      System.out.println("element found at "+ result);
    }
  }
}
class Binary_search{
  public int binary_search(int[] arr,int x){
    int l=0;
    int r=arr.length-1;
    while(l<=r){
      int m=(l+r-1)/2;
      if(arr[m]==x)
        return m;
      if(arr[m]>x)
        r=m-1;
      if(arr[m]<x)
        l=m+1;
        
    }
    return -1;
    
  }
}
